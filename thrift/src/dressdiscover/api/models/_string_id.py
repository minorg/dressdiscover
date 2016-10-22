from _id import _Id
import re


def decamelize(str_):
    return re.sub('(((?<=[a-z])[A-Z])|([A-Z](?![A-Z]|$)))', '_\\1', str_)\
            .lower()\
            .strip('_')


class _StringId(_Id):
    def py_imports_use(self, caller_stack):
        return ['import ' + self.py_qname().rsplit('.', 1)[0]]

    def py_read_protocol(self):
        qname = self.py_qname()
        return "%(qname)s.parse(iprot.read_string())" % locals()

