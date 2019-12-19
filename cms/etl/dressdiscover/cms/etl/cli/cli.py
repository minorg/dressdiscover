import logging
import os.path
from argparse import ArgumentParser
from importlib import import_module
from inspect import isclass

import requests
from rdflib import Graph

from dressdiscover.cms.etl.lib.pipeline._pipeline import _Pipeline
from dressdiscover.cms.etl.lib.pipeline.file_pipeline_storage import FilePipelineStorage


class Cli:
    def __init__(self):
        self.__argument_parser = ArgumentParser()
        self.__logger = logging.getLogger(self.__class__.__name__)

    def __add_arguments(self):
        self.__argument_parser.add_argument("--data-dir-path",
                                            help="path to a directory to store extracted data and transformed models")
        self.__argument_parser.add_argument(
            '--debug',
            action='store_true',
            help='turn on debugging'
        )
        self.__argument_parser.add_argument("-f", "--force", action="store_true",
                                            help="force extract and transform, ignoring any cached data")
        self.__argument_parser.add_argument("--force-extract", action="store_true",
                                            help="force extract, ignoring any cached data")
        self.__argument_parser.add_argument("--force-transform", action="store_true",
                                            help="force transform, ignoring any cached data")
        self.__argument_parser.add_argument("--fuseki-data-url", default="http://fuseki:3030/ds/data")
        self.__argument_parser.add_argument(
            '--logging-level',
            help='set logging-level level (see Python logging module)'
        )
        self.__argument_parser.add_argument(
            '--pipeline-id',
            help='unique identifier for this pipeline, used ',
            required=True
        )
        self.__argument_parser.add_argument(
            '--pipeline-module',
            help='absolute (parent.module) or relative (.module) module name for the pipeline implementation',
            required=True
        )

    def __configure_logging(self, args):
        if args.debug:
            logging_level = logging.DEBUG
        elif args.logging_level is not None:
            logging_level = getattr(logging, args.logging_level.upper())
        else:
            logging_level = logging.INFO
        logging.basicConfig(
            format='%(asctime)s:%(module)s:%(lineno)s:%(name)s:%(levelname)s: %(message)s',
            level=logging_level
        )

    def __create_data_dir_path(self, args) -> str:
        data_dir_path = args.data_dir_path
        if data_dir_path is None:
            for data_dir_path in (
                    # In the container
                    "/data",
                    # In the checkout
                    os.path.abspath(os.path.join(os.path.dirname(__file__), "..", "..", "..", "..", "data"))
            ):
                if os.path.isdir(data_dir_path):
                    break
        if not os.path.isdir(data_dir_path):
            raise ValueError("data dir path %s does not exist" % data_dir_path)
        data_dir_path = os.path.join(data_dir_path, args.pipeline_id)
        if not os.path.isdir(data_dir_path):
            os.makedirs(data_dir_path)
            self.__logger.info("created pipeline data directory %s", data_dir_path)
        return data_dir_path

    def __import_pipeline_class(self, args) -> _Pipeline:
        pipeline_module = import_module(args.pipeline_module, _Pipeline.__module__.rsplit(".", 1)[0])
        for attr in dir(pipeline_module):
            value = getattr(pipeline_module, attr)
            if isclass(value) and issubclass(value, _Pipeline):
                return value
        raise ImportError("no Pipeline in the %s module" % pipeline_module.__name__)

    def __instantiate_pipeline(self, args, pipeline_class, **kwds) -> _Pipeline:
        pipeline_kwds = vars(args).copy()
        pipeline_kwds.pop("data_dir_path")
        pipeline_kwds.pop("force")
        pipeline_kwds.pop("force_extract")
        pipeline_kwds.pop("force_transform")
        pipeline_kwds.pop("logging_level")
        pipeline_kwds.pop("pipeline_id")
        pipeline_kwds.pop("pipeline_module")
        pipeline_kwds.update(kwds)
        return pipeline_class(**pipeline_kwds)

    def __load(self, args, ttl: str) -> None:
        # Post to a named graph, since the Fuseki default graph is the union of all named graphs
        # https://www.w3.org/TR/2013/REC-sparql11-http-rdf-update-20130321/#http-post
        requests.post(
            args.fuseki_data_url + "?graph=urn:pipeline:" + args.pipeline_id,
            data=ttl,
            headers={
                "Content-Type": "text/turtle;charset=utf-8"
            }
        )

    def main(self):
        self.__add_arguments()
        args, _ = self.__argument_parser.parse_known_args()
        self.__configure_logging(args)

        pipeline_class = self.__import_pipeline_class(args)
        pipeline_class.add_arguments(self.__argument_parser)

        args = self.__argument_parser.parse_args()

        data_dir_path = self.__create_data_dir_path(args)

        pipeline = self.__instantiate_pipeline(args, pipeline_class)

        force = bool(getattr(args, "force", False))
        force_extract = force or bool(getattr(args, "force_extract", False))
        force_transform = force or bool(getattr(args, "force_transform", False))

        extract_kwds = pipeline.extractor.extract(force=force_extract, storage=FilePipelineStorage.create(
            os.path.join(data_dir_path, "extracted")))
        extract_kwds = extract_kwds if extract_kwds is not None else {}

        models = pipeline.transformer.transform(**extract_kwds)

        graph = Graph()
        transformed_storage = FilePipelineStorage.create(os.path.join(data_dir_path, "transformed"))
        for model in models:
            graph += model.graph
        graph_ttl = graph.serialize(format="ttl")
        transformed_storage.put(args.pipeline_id + ".ttl", graph_ttl)

        self.__load(args, graph_ttl)


def main():
    Cli().main()


if __name__ == '__main__':
    main()
