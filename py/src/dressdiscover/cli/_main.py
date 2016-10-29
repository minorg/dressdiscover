import logging

from argparse import ArgumentParser


class _Main(object):
    def __init__(self, debug):
        object.__init__(self)
        self.__debug = debug
        self.__logger = logging.getLogger(self.__class__.__module__ + '.' + self.__class__.__name__)

    @classmethod
    def _add_arguments(cls, argument_parser):
        pass

    @property
    def _debug(self):
        return self.__debug

    @property
    def _logger(self):
        return self.__logger

    def _run(self, **kwds):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__)

    @classmethod
    def main(cls):
        argument_parser = ArgumentParser()
        argument_parser.add_argument(
            '--debug',
            action='store_true',
            help='turn on debugging'
        )
        argument_parser.add_argument(
            '--logging-level',
            help='set logging-level level (see Python logging module)'
        )
        cls._add_arguments(argument_parser)
        args = argument_parser.parse_args()
        if args.debug:
            logging_level = logging.DEBUG
        elif args.logging_level is not None:
            logging_level = getattr(logging, args.logging_level.upper())
        else:
            logging_level = logging.INFO
        logging.basicConfig(
            format='%(asctime)s:%(module)s:%(lineno)s:%(name)s:%(levelname)s: %(message)s', #@IgnorePep8
            level=logging_level
        )
        #delattr(args, 'debug') # Pass debug= through to the command
        delattr(args, 'logging_level')

        cls(**args.__dict__)._run()
