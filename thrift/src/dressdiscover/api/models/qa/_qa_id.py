import os.path, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))
from _id import _Id


class _QaId(_Id):
   def java_read_protocol_throws_checked(self):
       return ['IllegalArgumentException']

   def java_name(self):
       return self.__class__.__name__

   def java_qname(self):
       return 'org.dressdiscover.api.models.qa.' + self.__class__.__name__

   def java_repr(self):
       name = self.java_name()
       return """\
public final class %(name)s extends org.thryft.waf.api.models.BsonModelId {
    public static %(name)s parse(final String value) {
        if (!_isValid(value)) {
            throw new IllegalArgumentException(value);
        }
        return new %(name)s(value);
    }

    private %(name)s(final String value) {
        super(value);
    }
}""" % locals()

   def ts_repr(self):
        name = self.ts_name()
        return """\
export class %(name)s {
    public static parse(id: string): %(name)s {
        if (id.trim().length != 24) {
            throw new RangeError('id is not the right length');
        }
        return new %(name)s(id);
    }

    public toString(): string {
        return this._id;
    }

    private constructor(id: string) {
        this._id = id;
    }

    private _id: string;
}""" % locals()
