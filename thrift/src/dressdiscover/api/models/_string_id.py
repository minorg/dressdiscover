from _id import _Id


class _StringId(_Id):
    def py_imports_use(self, caller_stack):
        return ['import ' + self.py_qname()]

    def py_read_protocol(self):
        qname = self.py_qname()
        return "%(qname)s.parse(iprot.read_string())" % locals()

