import logging
import sys
from argparse import ArgumentParser
import stringcase

from style_synonyms.classifications_csv_parser import ClassificationsCsvParser
from style_synonyms.workflows.label_it_workflow import LabelItWorkflow


class Main:
    __WORKFLOW_CLASSES = (LabelItWorkflow,)

    def __configure_logging(self, args):
        args_dict = args.__dict__

        if args_dict.get("debug", False):
            logging_level = logging.DEBUG
        elif args_dict.get("logging_level") is not None:
            logging_level = getattr(logging, args["logging_level"].upper())
        else:
            logging_level = logging.INFO
        logging.basicConfig(
            format="%(asctime)s:%(module)s:%(lineno)s:%(name)s:%(levelname)s: %(message)s",
            level=logging_level,
        )

    def __instantiate_workflow(self, args):
        workflow_kwds = args.__dict__.copy()
        for key in (
            "classifications_csv_file_path",
            "debug",
            "logging_level",
            "workflow_class",
        ):
            try:
                workflow_kwds.pop(key)
            except KeyError:
                pass
        workflow_class = args.workflow_class
        return workflow_class(**workflow_kwds)

    def main(self):
        args = self.__parse_args()

        self.__configure_logging(args)

        workflow = self.__instantiate_workflow(args)

        classifications = ClassificationsCsvParser().parse_classifications_csv(
            args.classifications_csv_file_path[0]
        )

        workflow_classifications = tuple(
            classification
            for classification in classifications
            if classification.workflow_id == workflow.id
        )

        workflow.analyze(classifications=workflow_classifications)

    def __parse_args(self):
        arg_parser = ArgumentParser()
        arg_parser.add_argument(
            "--debug", action="store_true", help="turn on debugging"
        )
        arg_parser.add_argument(
            "--logging-level",
            help="set logging-level level (see Python logging module)",
        )
        subparsers = arg_parser.add_subparsers()
        for workflow_class in self.__WORKFLOW_CLASSES:
            workflow_subparser = subparsers.add_parser(
                stringcase.spinalcase(workflow_class.__name__.rstrip("Workflow"))
            )
            workflow_subparser.add_argument("classifications_csv_file_path", nargs=1)
            workflow_class.add_arguments(workflow_subparser)
            workflow_subparser.set_defaults(workflow_class=workflow_class)
        args = arg_parser.parse_args()
        try:
            args.workflow_class
        except AttributeError:
            arg_parser.print_usage()
            sys.exit(1)
        return args


assert __name__ == "__main__"
Main().main()
