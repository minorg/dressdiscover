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
from thryft.generators.py.properties_py_generator import PropertiesPyGenerator
from thryft.generators.py.json_rpc_client_py_generator import JsonRpcClientPyGenerator
from thryft.generators.py.py_generator import PyGenerator
from thryft.generators.sql.create_table_sql_generator import CreateTableSqlGenerator
from yutil import indent, upper_camelize


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

EXCLUDE_COSTUME_CORE_FEATURE_NAMES = \
    (
        'Age',
        'Condition Term',
        'Function',
        'Gender',
        'Main Color',
        'Record Type',
        'Secondary Color',
        'Socio-Economic Class',
    )


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
             os.path.join(ROOT_DIR_PATH, 'sql'),
        ):
            if os.path.isdir(dir_path):
                shutil.rmtree(dir_path)

    def _compile(self):
        thrift_src_root_dir_path = os.path.join(ROOT_DIR_PATH, 'thrift', 'src')

        for pass_i in xrange(2):
            # Two passes: one to test-compile all .thrift files, the other to generate them
            # ASTs are cached in the compiler so this only costs us the file system traversal,
            # and avoids generating code when there's a compilation error
            if pass_i == 1:
                self._clean()

                # Copy thryft/lib/py to py/src
                shutil.copytree(
                    os.path.join(THRYFT_ROOT_DIR_PATH, 'lib', 'py', 'src', 'thryft'),
                    os.path.join(ROOT_DIR_PATH, 'py', 'src', 'thryft')
                )

                costume_core_controlled_vocabularies = self.__generate_costume_core_py()
                self.__generate_costume_core_java(costume_core_controlled_vocabularies)

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

                    if pass_i == 0:
                        continue

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

                        if thrift_file_base_name in ('user', 'user_bookmark',):
                            out_dir_path = os.path.join(ROOT_DIR_PATH, 'sql')
                            if not os.path.isdir(out_dir_path):
                                os.makedirs(out_dir_path)

                            self._compile_thrift_file(
                                generator=CreateTableSqlGenerator(),
                                out=out_dir_path,
                                **compile_kwds
                            )

                        elastic_search_templates_dir_path = os.path.join(ROOT_DIR_PATH, 'java', 'lib', 'src', 'main', 'resources', 'elastic_search_templates')
                        if thrift_file_base_name in ('object_summary',):
                            self._compile_thrift_file(
                                generator=ElasticSearchMappingsGenerator(
                                    settings=ELASTIC_SEARCH_INDEX_SETTINGS,
                                    template="%s_*" % thrift_file_base_name,
                                ),
                                out=os.path.join(elastic_search_templates_dir_path, thrift_file_base_name + '_template.json'),
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

    def __generate_costume_core_java(self, costume_core_controlled_vocabularies):
        number_strings = {
            1: 'ONE',
            2: 'TWO',
            3: 'THREE',
            4: 'FOUR',
            5: 'FIVE',
            6: 'SIX',
            7: 'SEVEN'
        }

        add_feature_names = []
        feature_enums = []
        put_features = []
        for feature_name in sorted(costume_core_controlled_vocabularies.iterkeys()):
            if feature_name in EXCLUDE_COSTUME_CORE_FEATURE_NAMES:
                continue

            feature_values = sorted(costume_core_controlled_vocabularies[feature_name].keys())

            feature_name_upper_camelized = feature_name.replace(' ', '')
            feature_value_enums = []
            for feature_value in feature_values:
                feature_value_safe = feature_value.upper()
                for c in ' _-_/()\'':
                    feature_value_safe = feature_value_safe.replace(c, '_')
                feature_value_safe = feature_value_safe.replace('___', '_').replace('__', '_').rstrip('_')
                try:
                    feature_value_safe = number_strings[int(feature_value_safe[0])] + feature_value_safe[1:]
                except ValueError:
                    pass
                feature_value_enums.append("""\
%(feature_value_safe)s("%(feature_value)s")""" % locals())
            feature_value_enums = indent(' ' * 4, ",\n".join(feature_value_enums))
            feature_enums.append("""\
public enum %(feature_name_upper_camelized)s implements Feature {
%(feature_value_enums)s;

    public final String getDisplayName() {
        return displayName;
    }

    private %(feature_name_upper_camelized)s(final String displayName) {
        this.displayName = displayName;
    }

    private final String displayName;
}""" % locals())

            add_feature_names.append(".add(\"%(feature_name)s\")" % locals())
            put_features.append(".put(\"%(feature_name)s\", %(feature_name_upper_camelized)s.values())" % locals())
        add_feature_names = ''.join(add_feature_names)
        feature_enums = "\n\n".join(indent(' ' * 4, feature_enums))
        put_features = ''.join(put_features)

        out_dir_path = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'java', 'gui', 'src', 'gen', 'java', 'net', 'lab1318', 'costume', 'gui', 'models', 'wizard'))
        if not os.path.isdir(out_dir_path):
            os.makedirs(out_dir_path)
        out_file_path = os.path.join(out_dir_path, 'CostumeCore.java')

        with open(out_file_path, 'w+b') as f:
            f.write("""\
package net.lab1318.costume.gui.models.wizard;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public final class CostumeCore {
    public interface Feature {
        public String getDisplayName();

        public String name();
    }

%(feature_enums)s

    public final static ImmutableMap<String, Feature[]> FEATURES = ImmutableMap.<String, Feature[]> builder()%(put_features)s.build();
    public final static ImmutableList<String> FEATURE_NAMES = ImmutableList.<String> builder()%(add_feature_names)s.build();
}""" % locals())

    def __generate_costume_core_py(self):
        csv_file_name = 'Costume Core Controlled Vocabularies - 2nd draft, Jan 2013.csv'
        csv_file_path = os.path.join(os.path.dirname(__file__), '..', '..', 'devdata', csv_file_name)
        assert os.path.exists(csv_file_path), csv_file_path
        out_file_path = os.path.join(os.path.dirname(__file__), '..', '..', 'py', 'src', 'costume', 'etl', 'costume_core', 'costume_core_controlled_vocabularies.py')

        out = {}
        header_row = {}
        with open(csv_file_path, 'rb') as f:
            for row_i, row in enumerate(csv.reader(f)):
                for column_i, column in enumerate(row):
                    if column_i == 0:
                        continue
                    column = column.strip()
                    if len(column) == 0:
                        continue

                    if row_i == 0:
                        header_row[column_i] = column
                        out[column] = {}
                        continue
                    elif row_i == 1:
                        # Description of the column
                        continue
                    elif row_i == 2:
                        # Source of the vocabulary
                        continue

                    out[header_row[column_i]][column] = None

        with open(out_file_path, 'w+b') as f:
            f.write('COSTUME_CORE_CONTROLLED_VOCABULARIES = ' + pformat(out))

        return out


assert __name__ == '__main__'
Main.main()
