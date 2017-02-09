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
from thryft.generators.cs.cs_generator import CsGenerator
from thryft.generators.java.java_generator import JavaGenerator
from thryft.generators.java.json_rpc_servlet_java_generator import JsonRpcServletJavaGenerator
from thryft.generators.java.logging_service_java_generator import LoggingServiceJavaGenerator
from thryft.generators.java.properties_java_generator import PropertiesJavaGenerator
from thryft.generators.java.validating_service_java_generator import ValidatingServiceJavaGenerator
from thryft.generators.lint.lint_generator import LintGenerator
from thryft.generators.py.py_generator import PyGenerator
from thryft.generators.sql.create_table_sql_generator import CreateTableSqlGenerator
from thryft.generators.ts.async_to_sync_service_ts_generator import AsyncToSyncServiceTsGenerator
from thryft.generators.ts.backbone_ts_generator import BackboneTsGenerator
from thryft.generators.ts.json_rpc_client_ts_generator import JsonRpcClientTsGenerator
from thryft.generators.ts.ts_generator import TsGenerator
from yutil import indent, upper_camelize


CS_OUT_DIR_PATH = os.path.join(ROOT_DIR_PATH, 'cs', 'DressDiscover', 'DressDiscover.Portable', 'src')
PY_OUT_DIR_PATH = os.path.join(ROOT_DIR_PATH, 'py', 'src')
TS_OUT_DIR_PATH = os.path.join(ROOT_DIR_PATH, 'ts')
TS_PROJECT_NAMES = ('qa', 'worksheet')


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
        dir_paths = [
             os.path.join(CS_OUT_DIR_PATH, 'DressDiscover', 'Api'),
             os.path.join(ROOT_DIR_PATH, 'java', 'api', 'src', 'gen', 'java', 'org', 'dressdiscover'),
             os.path.join(ROOT_DIR_PATH, 'java', 'api', 'src', 'gen', 'java', 'org', 'dressdiscover'),
             os.path.join(ROOT_DIR_PATH, 'java', 'lib', 'src', 'gen', 'java', 'org', 'dressdiscover'),
             os.path.join(ROOT_DIR_PATH, 'java', 'server', 'src', 'gen', 'java', 'org', 'dressdiscover'),
             os.path.join(PY_OUT_DIR_PATH, 'dressdiscover', 'api'),
             os.path.join(PY_OUT_DIR_PATH, 'thryft'),
             os.path.join(ROOT_DIR_PATH, 'sql'),
        ]
        for ts_project_name in TS_PROJECT_NAMES:
            dir_paths.append(os.path.join(TS_OUT_DIR_PATH, ts_project_name, 'src', 'dressdiscover', 'api'))

        for dir_path in dir_paths:
            if os.path.isdir(dir_path):
                for i in xrange(10):
                    try:
                        shutil.rmtree(dir_path)
                    except WindowsError:
                        pass

        os.makedirs(os.path.join(PY_OUT_DIR_PATH, 'dressdiscover', 'api'))
        for ts_project_name in TS_PROJECT_NAMES:
            os.makedirs(os.path.join(TS_OUT_DIR_PATH, ts_project_name, 'src', 'dressdiscover', 'api'))

        # Copy thryft/lib/py to py/src
        shutil.copytree(
            os.path.join(THRYFT_ROOT_DIR_PATH, 'lib', 'py', 'src', 'thryft'),
            os.path.join(PY_OUT_DIR_PATH, 'thryft')
        )

    def _compile(self):
        thrift_src_root_dir_path = os.path.join(ROOT_DIR_PATH, 'thrift', 'src')

        cs_generator = CsGenerator()
        java_generator = \
            JavaGenerator(
                default_methods=True,
                function_overloads=True,
                namespace_prefix='org.',
            )
        json_rpc_servlet_java_generator = JsonRpcServletJavaGenerator(namespace_prefix='org.')
        lint_generator = LintGenerator()
        logging_service_java_generator = \
            LoggingServiceJavaGenerator(
                exception_log_level_default='error',
                namespace_prefix='org.',
            )
        properties_java_generator = PropertiesJavaGenerator(project_name='dressdiscover', namespace_prefix='org.')
        py_generator = PyGenerator()
        sql_generator = CreateTableSqlGenerator()
        validating_service_java_generator = ValidatingServiceJavaGenerator(namespace_prefix='org.')

        for pass_i in xrange(2):
            # Two passes: one to test-compile all .thrift files, the other to generate them
            # ASTs are cached in the compiler so this only costs us the file system traversal,
            # and avoids generating code when there's a compilation error
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

                    if pass_i == 0:
                        self._compile_thrift_file(
                            generator=lint_generator,
                            **compile_kwds
                        )

                        continue

                    if thrift_subdir_name == 'api':
                        if thrift_file_base_name == 'io_exception' or \
                           thrift_file_dir_name in TS_PROJECT_NAMES:
                            if thrift_file_dir_name == 'worksheet':
                                self._compile_thrift_file(
                                    generator=cs_generator,
                                    out=CS_OUT_DIR_PATH,
                                    **compile_kwds
                                )

                            self._compile_thrift_file(
                                generator=py_generator,
                                out=PY_OUT_DIR_PATH,
                                **compile_kwds
                            )

                            ts_out = []
                            for ts_project_name in TS_PROJECT_NAMES:
                                if thrift_file_dir_name not in TS_PROJECT_NAMES or \
                                   thrift_file_dir_name == ts_project_name:
                                    ts_out_dir_path = os.path.join(TS_OUT_DIR_PATH, ts_project_name, 'src')
                                else:
                                    continue
                                if ts_project_name == 'qa':
                                    ts_generator = TsGenerator(ts_out_dir_path=ts_out_dir_path)
                                else:
                                    ts_generator = BackboneTsGenerator(ts_out_dir_path=ts_out_dir_path)
                                ts_out.append((ts_generator, ts_out_dir_path))

                            for ts_generator, ts_out_dir_path in ts_out:
                                self._compile_thrift_file(
                                    generator=ts_generator,
                                    out=ts_out_dir_path,
                                    **compile_kwds
                                )

                                if thrift_file_base_name.endswith('_service'):
                                    if thrift_file_dir_name == 'qa':
                                        self._compile_thrift_file(
                                            generator=JsonRpcClientTsGenerator(ts_out_dir_path=ts_out_dir_path),
                                            out=ts_out_dir_path,
                                            **compile_kwds
                                        )

                                    self._compile_thrift_file(
                                        generator=AsyncToSyncServiceTsGenerator(ts_out_dir_path=ts_out_dir_path),
                                        out=ts_out_dir_path,
                                        **compile_kwds
                                    )

                            if thrift_file_dir_name in TS_PROJECT_NAMES:
                                continue

                    if thrift_subdir_name in ('lib', 'server') and thrift_file_base_name.endswith('_properties'):
                        self._compile_thrift_file(
                            generator=properties_java_generator,
                            out=os.path.join(ROOT_DIR_PATH, 'java', thrift_subdir_name, 'src', 'gen', 'java'),
                            **compile_kwds
                        )

                        continue

                    assert thrift_subdir_name == 'api'

                    self._compile_thrift_file(
                        generator=java_generator,
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
                            generator=sql_generator,
                            out=out_dir_path,
                            **compile_kwds
                        )
                    elif thrift_file_base_name.endswith('_service'):
                        self._compile_thrift_file(
                            generator=logging_service_java_generator,
                            out=os.path.join(ROOT_DIR_PATH, 'java', 'lib', 'src', 'gen', 'java'),
                            **compile_kwds
                        )

                        self._compile_thrift_file(
                            generator=validating_service_java_generator,
                            out=os.path.join(ROOT_DIR_PATH, 'java', 'lib', 'src', 'gen', 'java'),
                            **compile_kwds
                        )

                        self._compile_thrift_file(
                            generator=json_rpc_servlet_java_generator,
                            out=os.path.join(ROOT_DIR_PATH, 'java', 'server', 'src', 'gen', 'java'),
                            **compile_kwds
                        )


assert __name__ == '__main__'
Main.main()
