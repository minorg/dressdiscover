import os.path, sys
sys.path.append(os.path.join(os.path.dirname(__file__)))
from _qa_id import _QaId


class QaUserId(_QaId):
    def ts_repr(self):
        name = self.ts_name()
        return """\
export class %(name)s {
    public static parse(id: string): %(name)s {
        if (id.trim().length == 0) {
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
