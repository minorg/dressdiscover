import os.path, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))
from _id import _Id


class _QaId(_Id):
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
