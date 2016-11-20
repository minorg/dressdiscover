import csv
import os.path
import shutil
import sys
from pprint import pformat

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
from thryft.generators.lint.lint_generator import LintGenerator
from thryft.generators.py.properties_py_generator import PropertiesPyGenerator
from thryft.generators.py.json_rpc_client_py_generator import JsonRpcClientPyGenerator
from thryft.generators.py.py_generator import PyGenerator
from thryft.generators.sql.create_table_sql_generator import CreateTableSqlGenerator
from thryft.generators.ts.ts_generator import TsGenerator
from yutil import indent, upper_camelize


TS_OUT_DIR_PATH = os.path.join(ROOT_DIR_PATH, 'ts', 'src')


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
             os.path.join(ROOT_DIR_PATH, 'java', 'api', 'src', 'gen', 'java', 'org', 'dressdiscover'),
             os.path.join(ROOT_DIR_PATH, 'java', 'lib', 'src', 'gen', 'java', 'org', 'dressdiscover'),
             os.path.join(ROOT_DIR_PATH, 'java', 'server', 'src', 'gen', 'java', 'org', 'dressdiscover'),
             os.path.join(ROOT_DIR_PATH, 'sql'),
             os.path.join(TS_OUT_DIR_PATH, 'dressdiscover', 'api'),
        ):
            if os.path.isdir(dir_path):
                for i in xrange(10):
                    try:
                        shutil.rmtree(dir_path)
                    except WindowsError:
                        pass
        os.makedirs(os.path.join(TS_OUT_DIR_PATH, 'dressdiscover', 'api'))

    def _compile(self):
        thrift_src_root_dir_path = os.path.join(ROOT_DIR_PATH, 'thrift', 'src')

        self.__generate_definitions_js()

        for pass_i in xrange(2):
            # Two passes: one to test-compile all .thrift files, the other to generate them
            # ASTs are cached in the compiler so this only costs us the file system traversal,
            # and avoids generating code when there's a compilation error
            if pass_i == 1:
                self._clean()

            for thrift_subdir_name in ('api', 'lib', 'server'):
                thrift_src_dir_path = os.path.join(thrift_src_root_dir_path, 'dressdiscover', thrift_subdir_name)
                if not os.path.isdir(thrift_src_dir_path):
                    continue

                for thrift_file_path in self._get_thrift_file_paths(thrift_src_dir_path):
                    thrift_file_dir_path, thrift_file_name = os.path.split(thrift_file_path)
                    thrift_file_base_name = os.path.splitext(thrift_file_name)[0]
                    thrift_file_dir_name = os.path.split(thrift_file_dir_path)[1]

                    compile_kwds = {
                        'document_root_dir_path': thrift_src_root_dir_path,
                        'thrift_file_path': thrift_file_path
                    }

                    self._compile_thrift_file(
                        generator=LintGenerator(),
                        **compile_kwds
                    )

                    if pass_i == 0:
                        continue

                    if thrift_subdir_name == 'api':
                        if thrift_file_base_name == 'io_exception' or \
                           thrift_file_dir_name == 'worksheet':
                            self._compile_thrift_file(
                                generator=TsGenerator(ts_out_dir_path=TS_OUT_DIR_PATH),
                                out=TS_OUT_DIR_PATH,
                                **compile_kwds
                            )
                            if thrift_file_dir_name == 'worksheet':
                                continue

                    if thrift_subdir_name in ('lib', 'server') and thrift_file_base_name.endswith('_properties'):
                        self._compile_thrift_file(
                            generator=PropertiesJavaGenerator(project_name='dressdiscover', namespace_prefix='org.'),
                            out=os.path.join(ROOT_DIR_PATH, 'java', thrift_subdir_name, 'src', 'gen', 'java'),
                            **compile_kwds
                        )

                        continue

                    assert thrift_subdir_name == 'api'

                    self._compile_thrift_file(
                        generator=JavaGenerator(
                            default_methods=True,
                            function_overloads=True,
                            namespace_prefix='org.',
                        ),
                        out=os.path.join(ROOT_DIR_PATH, 'java', thrift_subdir_name, 'src', 'gen', 'java'),
                        **compile_kwds
                    )

                    if thrift_file_base_name in ('object_summary',):
                        elastic_search_templates_dir_path = os.path.join(ROOT_DIR_PATH, 'java', 'lib', 'src', 'main', 'resources', 'elastic_search_templates')
                        self._compile_thrift_file(
                            generator=ElasticSearchMappingsGenerator(
                                settings=ELASTIC_SEARCH_INDEX_SETTINGS,
                                template="%s_*" % thrift_file_base_name,
                            ),
                            out=os.path.join(elastic_search_templates_dir_path, thrift_file_base_name + '_template.json'),
                            **compile_kwds
                        )
                    elif thrift_file_base_name in ('user', 'user_bookmark',):
                        out_dir_path = os.path.join(ROOT_DIR_PATH, 'sql')
                        if not os.path.isdir(out_dir_path):
                            os.makedirs(out_dir_path)

                        self._compile_thrift_file(
                            generator=CreateTableSqlGenerator(),
                            out=out_dir_path,
                            **compile_kwds
                        )
                    elif thrift_file_base_name.endswith('_service'):
                        self._compile_thrift_file(
                            generator=LoggingServiceJavaGenerator(
                                exception_log_level_default='error',
                                namespace_prefix='org.',
                            ),
                            out=os.path.join(ROOT_DIR_PATH, 'java', 'lib', 'src', 'gen', 'java'),
                            **compile_kwds
                        )

                        self._compile_thrift_file(
                            generator=ValidatingServiceJavaGenerator(namespace_prefix='org.'),
                            out=os.path.join(ROOT_DIR_PATH, 'java', 'lib', 'src', 'gen', 'java'),
                            **compile_kwds
                        )

                        self._compile_thrift_file(
                            generator=JsonRpcServletJavaGenerator(namespace_prefix='org.'),
                            out=os.path.join(ROOT_DIR_PATH, 'java', 'server', 'src', 'gen', 'java'),
                            **compile_kwds
                        )

    def __generate_definitions_js(self):
        out = []
        for feature_set_i in xrange(2):
            feature_set_dict = {'id': "Feature Set %(feature_set_i)d" % locals(), 'child_feature_sets': []}
            for sub_feature_set_i in xrange(2):
                sub_feature_set_dict = {'id': "Sub Feature Set %(feature_set_i)d-%(sub_feature_set_i)d" % locals(), 'features': []}
                for feature_i in xrange(10):
                    feature_dict = {'id': "Feature %(feature_set_i)d-%(sub_feature_set_i)d-%(feature_i)d" % locals()}
                    if feature_i == 0:
                        feature_dict['display_name'] = feature_dict['id'] + ' (text)'
                        feature_dict['text'] = {}
                    else:
                        feature_values = []
                        for feature_value_i in xrange(10):
                            feature_value_dict = {'id': "Value %(feature_set_i)d-%(sub_feature_set_i)d-%(feature_i)d-%(feature_value_i)d" % locals()}
                            if feature_value_i == 0:
                                feature_value_dict['display_name'] = feature_value_dict['id'] + ' (display name)'
                            image_text = feature_value_dict['id'].replace(' ', '+')
                            feature_value_dict['image'] = {
                                'full_size_url': "http://placehold.it/800x600?text=%(image_text)s" % locals(),
                                'rights': "Placeholder rights",
                                'thumbnail_url': "http://placehold.it/200x200?text=%(image_text)s" % locals(),
                            }
                            feature_values.append(feature_value_dict)
                        feature_dict['enum_'] = {'values_': feature_values}
                    sub_feature_set_dict['features'].append(feature_dict)
                feature_set_dict['child_feature_sets'].append(sub_feature_set_dict)
            out.append(feature_set_dict)
        file_path = os.path.join(ROOT_DIR_PATH, 'ts', 'data', 'definitions.js')
        import json
        with open(file_path, 'w+b') as f:
            f.write('FEATURES = ' + json.dumps(out, indent=4))


assert __name__ == '__main__'
Main.main()
