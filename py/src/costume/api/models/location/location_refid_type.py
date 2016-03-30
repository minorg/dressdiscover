class LocationRefidType(object):
    ACCESSION = None
    BARCODE = None
    SHELF_LIST = None
    OTHER = None

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
        if name == 'ACCESSION' or name == '0':
            return getattr(LocationRefidType, 'ACCESSION')
        elif name == 'BARCODE' or name == '1':
            return getattr(LocationRefidType, 'BARCODE')
        elif name == 'SHELF_LIST' or name == '2':
            return getattr(LocationRefidType, 'SHELF_LIST')
        elif name == 'OTHER' or name == '3':
            return getattr(LocationRefidType, 'OTHER')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (LocationRefidType.ACCESSION, LocationRefidType.BARCODE, LocationRefidType.SHELF_LIST, LocationRefidType.OTHER,)

LocationRefidType.ACCESSION = LocationRefidType('ACCESSION', 0)
LocationRefidType.BARCODE = LocationRefidType('BARCODE', 1)
LocationRefidType.SHELF_LIST = LocationRefidType('SHELF_LIST', 2)
LocationRefidType.OTHER = LocationRefidType('OTHER', 3)
