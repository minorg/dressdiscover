class Type(object):
    STOP = None
    VOID_ = None
    BOOL = None
    BYTE = None
    DOUBLE = None
    FLOAT = None
    I16 = None
    I32 = None
    I64 = None
    LIST = None
    MAP = None
    SET = None
    STRING = None
    STRUCT = None
    U64 = None

    def __init__(self, name, value):
        object.__init__(self)
        self.__name = name
        self.__value = value

    def __int__(self):
        return self.__value

    def __repr__(self):
        return self.__name

    def __str__(self):
        return self.__name

    @classmethod
    def value_of(cls, name):
        if name == 'STOP' or name == '0':
            return getattr(Type, 'STOP')
        elif name == 'VOID_' or name == '1':
            return getattr(Type, 'VOID_')
        elif name == 'BOOL' or name == '2':
            return getattr(Type, 'BOOL')
        elif name == 'BYTE' or name == '3':
            return getattr(Type, 'BYTE')
        elif name == 'DOUBLE' or name == '4':
            return getattr(Type, 'DOUBLE')
        elif name == 'FLOAT' or name == '18':
            return getattr(Type, 'FLOAT')
        elif name == 'I16' or name == '6':
            return getattr(Type, 'I16')
        elif name == 'I32' or name == '8':
            return getattr(Type, 'I32')
        elif name == 'I64' or name == '10':
            return getattr(Type, 'I64')
        elif name == 'LIST' or name == '15':
            return getattr(Type, 'LIST')
        elif name == 'MAP' or name == '13':
            return getattr(Type, 'MAP')
        elif name == 'SET' or name == '14':
            return getattr(Type, 'SET')
        elif name == 'STRING' or name == '11':
            return getattr(Type, 'STRING')
        elif name == 'STRUCT' or name == '12':
            return getattr(Type, 'STRUCT')
        elif name == 'U64' or name == '9':
            return getattr(Type, 'U64')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (Type.STOP, Type.VOID_, Type.BOOL, Type.BYTE, Type.DOUBLE, Type.FLOAT, Type.I16, Type.I32, Type.I64, Type.LIST, Type.MAP, Type.SET, Type.STRING, Type.STRUCT, Type.U64,)

Type.STOP = Type('STOP', 0)
Type.VOID_ = Type('VOID_', 1)
Type.BOOL = Type('BOOL', 2)
Type.BYTE = Type('BYTE', 3)
Type.DOUBLE = Type('DOUBLE', 4)
Type.FLOAT = Type('FLOAT', 18)
Type.I16 = Type('I16', 6)
Type.I32 = Type('I32', 8)
Type.I64 = Type('I64', 10)
Type.LIST = Type('LIST', 15)
Type.MAP = Type('MAP', 13)
Type.SET = Type('SET', 14)
Type.STRING = Type('STRING', 11)
Type.STRUCT = Type('STRUCT', 12)
Type.U64 = Type('U64', 9)
