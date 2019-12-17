import logging
import os.path
from argparse import ArgumentParser
from typing import Dict

from dressdiscover.cms.etl.lib.pipeline._pipeline import _Pipeline


class Cli:
    class __PipelineWrapper:
        def __init__(self, *, data_dir_path: str, logger, pipeline: _Pipeline):
            self.__data_dir_path = data_dir_path
            self.__logger = logger
            self.__pipeline = pipeline
            self.__pipeline_file_name = pipeline.__module__ + '.' + pipeline.__class__.__name__

        def extract(self, *, force: bool) -> Dict[str, object]:
            extracted_data_dir_path = os.path.join(self.__data_dir_path, self.__pipeline_file_name, "extracted")
            if not os.path.isdir(extracted_data_dir_path):
                os.makedirs(extracted_data_dir_path)
                self.__logger.info("created extracted directory %s", extracted_data_dir_path)
            extract_kwds = self.__pipeline.extractor.extract(extracted_data_dir_path=extracted_data_dir_path, force=force)
            return extract_kwds if extract_kwds is not None else {}

        def transform(self, *, force: bool, **extract_kwds) -> str:
            transformed_data_dir_path = os.path.join(self.__data_dir_path, self.__pipeline_file_name, "transformed")
            if not os.path.isdir(transformed_data_dir_path):
                os.makedirs(transformed_data_dir_path)
                self.__logger.info("created transformed directory %s", transformed_data_dir_path)

            models = self.__pipeline.transformer.transform(**extract_kwds)

            # TODO write models to a single graph .ttl in the transformed directory

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
        self.__argument_parser.add_argument(
            '--logging-level',
            help='set logging-level level (see Python logging module)'
        )
        self.__argument_parser.add_argument(
            'pipeline',
            help='pipeline name or full-qualified module name',
            # required=True
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
                    os.path.abspath(os.path.join(os.path.dirname(__file__), "..", "..", "..", "..", "..", "data"))
            ):
                if os.path.isdir(data_dir_path):
                    break
        if not os.path.isdir(data_dir_path):
            raise ValueError("data dir path %s does not exist" % data_dir_path)
        return data_dir_path

    def __import_pipeline_class(self, pipeline: str) -> _Pipeline:
        try

        pass

    def __instantiate_pipeline(self, args, pipeline_class):
        pipeline_kwds = vars(args)
        pipeline_kwds.pop("data_dir_path")
        pipeline_kwds.pop("force")
        pipeline_kwds.pop("force_extract")
        pipeline_kwds.pop("force_transform")
        pipeline_kwds.pop("logging_level")
        pipeline_kwds.pop("pipeline")
        return pipeline_class(**pipeline_kwds)

    def __load(self, ttl_file_path: str) -> None:
        pass

    def main(self):
        self.__add_arguments()
        args, _ = self.__argument_parser.parse_known_args()
        self.__configure_logging(args)

        pipeline_class = self.__import_pipeline_class(args.pipeline)
        pipeline_class.add_arguments(self.__argument_parser)

        args = self.__argument_parser.parse_args()

        pipeline = self.__instantiate_pipeline(args, pipeline_class)

        data_dir_path = self.__create_data_dir_path(args)

        force = bool(args.force)
        force_extract = force or bool(args.force_extract)
        force_transform = force or bool(args.force_transform)

        pipeline_wrapper = self.__PipelineWrapper(data_dir_path=data_dir_path, pipeline=pipeline)

        extract_kwds = pipeline_wrapper.extract(force=force_extract)

        ttl_file_path = pipeline_wrapper.transform(force=force_transform, **extract_kwds)

        self.__load(ttl_file_path)

def main():
    Cli().main()