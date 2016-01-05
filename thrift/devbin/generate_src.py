import os.path
import shutil
import sys

try:
    __import__('thryft')
    raise RuntimeError('thryft should not be on the PYTHONPATH already')
except ImportError:
    pass

MY_DIR_PATH = os.path.dirname(os.path.realpath(__file__))
ROOT_DIR_PATH = os.path.abspath(os.path.join(MY_DIR_PATH, '..', '..'))
THRYFT_ROOT_DIR_PATH = os.path.abspath(os.path.join(ROOT_DIR_PATH, '..', 'thryft'))
assert os.path.isdir(THRYFT_ROOT_DIR_PATH), THRYFT_ROOT_DIR_PATH
sys.path.insert(0, os.path.join(THRYFT_ROOT_DIR_PATH, 'compiler', 'src'))

# Generate from thrift
import thryft.main
from thryft.generators.elastic_search.elastic_search_mappings_generator import ElasticSearchMappingsGenerator
from thryft.generators.java.bean_java_generator import BeanJavaGenerator
from thryft.generators.java.java_generator import JavaGenerator
from thryft.generators.java.json_rpc_servlet_java_generator import JsonRpcServletJavaGenerator
from thryft.generators.java.logging_service_java_generator import LoggingServiceJavaGenerator
from thryft.generators.java.properties_java_generator import PropertiesJavaGenerator
from thryft.generators.java.validating_service_java_generator import ValidatingServiceJavaGenerator
from thryft.generators.py.properties_py_generator import PropertiesPyGenerator
from thryft.generators.py.json_rpc_client_py_generator import JsonRpcClientPyGenerator
from thryft.generators.py.py_generator import PyGenerator
from yutil import upper_camelize


ELASTIC_SEARCH_INDEX_SETTINGS = \
    {
        "analysis": {
            "analyzer": {
              "email_and_url": {
                "filter": [
                  "standard",
                  "lowercase"
                ],
                "tokenizer": "uax_url_email"
              },
            }
          }
    }


class Main(thryft.main.Main):
    def __init__(self, **kwds):
        thryft.main.Main.__init__(
            self,
            include_dir_paths=(
                os.path.join(ROOT_DIR_PATH, 'thrift', 'src'),
            ),
            **kwds
        )

    def _clean(self):
        for dir_path in (
             os.path.join(ROOT_DIR_PATH, 'java', 'api', 'src', 'gen', 'java', 'net'),
             os.path.join(ROOT_DIR_PATH, 'java', 'gui', 'src', 'gen', 'java', 'net'),
             os.path.join(ROOT_DIR_PATH, 'java', 'lib', 'src', 'gen', 'java', 'net'),
             os.path.join(ROOT_DIR_PATH, 'java', 'server', 'src', 'gen', 'java', 'net'),
             os.path.join(ROOT_DIR_PATH, 'py', 'src', 'costume', 'api'),
             os.path.join(ROOT_DIR_PATH, 'py', 'src', 'costume', 'client'),
             os.path.join(ROOT_DIR_PATH, 'py', 'src', 'thryft'),
        ):
            if os.path.isdir(dir_path):
                shutil.rmtree(dir_path)

    def _compile(self):
        self._clean()

        # Copy thryft/lib/py to py/src
        shutil.copytree(
            os.path.join(THRYFT_ROOT_DIR_PATH, 'lib', 'py', 'src', 'thryft'),
            os.path.join(ROOT_DIR_PATH, 'py', 'src', 'thryft')
        )

        thrift_src_root_dir_path = os.path.join(ROOT_DIR_PATH, 'thrift', 'src')

        for thrift_subdir_name in ('api', 'gui', 'lib', 'server'):
            thrift_src_dir_path = os.path.join(thrift_src_root_dir_path, 'costume', thrift_subdir_name)
            if not os.path.isdir(thrift_src_dir_path):
                continue

            for thrift_file_path in self._get_thrift_file_paths(thrift_src_dir_path):
                thrift_file_name = os.path.split(thrift_file_path)[1]
                thrift_file_base_name = os.path.splitext(thrift_file_name)[0]

                compile_kwds = {
                    'document_root_dir_path': thrift_src_root_dir_path,
                    'thrift_file_path': thrift_file_path
                }

                self._compile_thrift_file(generator=None, out=None, **compile_kwds)

                if thrift_file_name == 'costume_properties.thrift':
                    self._compile_thrift_file(
                        generator=PropertiesJavaGenerator(project_name='costume'),
                        out=os.path.join(ROOT_DIR_PATH, 'java', 'lib', 'src', 'gen', 'java'),
                        **compile_kwds
                    )

                    self._compile_thrift_file(
                        generator=PropertiesPyGenerator(project_name='costume'),
                        out=os.path.join(ROOT_DIR_PATH, 'py', 'src'),
                        **compile_kwds
                    )

                    continue

                self._compile_thrift_file(
                    generator=JavaGenerator(default_methods=True, function_overloads=True),
                    out=os.path.join(ROOT_DIR_PATH, 'java', thrift_subdir_name, 'src', 'gen', 'java'),
                    **compile_kwds
                )

                if 'models' in thrift_file_path.split(os.path.sep):
                    self._compile_thrift_file(
                        generator=BeanJavaGenerator(default_methods=True, function_overloads=True),
                        out=os.path.join(ROOT_DIR_PATH, 'java', 'gui', 'src', 'gen', 'java'),
                        **compile_kwds
                    )

                if thrift_subdir_name == 'api':
                    self._compile_thrift_file(
                        generator=PyGenerator(),
                        out=os.path.join(ROOT_DIR_PATH, 'py', 'src'),
                        **compile_kwds
                    )

                    elastic_search_templates_dir_path = os.path.join(ROOT_DIR_PATH, 'java', 'lib', 'src', 'main', 'resources', 'elastic_search_templates')
                    if thrift_file_base_name in ('collection', 'object', 'object_summary'):
                        if thrift_file_base_name == 'object':
                            file_base_name = 'object_detail_template'
                            template = "%s_detail_*" % thrift_file_base_name
                        else:
                            file_base_name = thrift_file_base_name + '_template'
                            template = "%s_*" % thrift_file_base_name
                        self._compile_thrift_file(
                            generator=ElasticSearchMappingsGenerator(
                                settings=ELASTIC_SEARCH_INDEX_SETTINGS,
                                template=template,
                            ),
                            out=os.path.join(elastic_search_templates_dir_path, file_base_name + '.json'),
                            **compile_kwds
                        )

                if not thrift_file_path.endswith('_service.thrift'):
                    continue
                # Only *_service.thrift from here on

                if thrift_subdir_name in ('api', 'lib'):
                    java_subdir_name = 'lib'
                elif thrift_subdir_name == 'server':
                    java_subdir_name = 'server'
                else:
                    raise NotImplementedError(thrift_subdir_name)

                self._compile_thrift_file(
                    generator=LoggingServiceJavaGenerator(
                        call_log_level_default='info' if thrift_subdir_name == 'server' else 'debug',
                        exception_log_level_default='error'
                    ),
                    out=os.path.join(ROOT_DIR_PATH, 'java', java_subdir_name, 'src', 'gen', 'java'),
                    **compile_kwds
                )

                self._compile_thrift_file(
                    generator=ValidatingServiceJavaGenerator(),
                    out=os.path.join(ROOT_DIR_PATH, 'java', java_subdir_name, 'src', 'gen', 'java'),
                    **compile_kwds
                )

                if thrift_subdir_name in ('api', 'server'):
                    self._compile_thrift_file(
                        generator=JsonRpcServletJavaGenerator(),
                        out=os.path.join(ROOT_DIR_PATH, 'java', 'server', 'src', 'gen', 'java'),
                        **compile_kwds
                    )

                if thrift_subdir_name != 'api':
                    # Only generate Python for the API services
                    continue

                self._compile_thrift_file(
                    generator=JsonRpcClientPyGenerator(),
                    out=os.path.join(ROOT_DIR_PATH, 'py', 'src'),
                    **compile_kwds
                )


assert __name__ == '__main__'
Main.main()
