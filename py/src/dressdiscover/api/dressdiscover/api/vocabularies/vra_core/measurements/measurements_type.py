class MeasurementsType(object):
    AREA = None
    BASE = None
    BIT_DEPTH = None
    CIRCUMFERENCE = None
    COUNT = None
    DEPTH = None
    DIAMETER = None
    DISTANCE_BETWEEN = None
    DURATION = None
    FILE_SIZE = None
    HEIGHT = None
    LENGTH = None
    RESOLUTION = None
    RUNNING_TIME = None
    SCALE = None
    SIZE = None
    TARGET = None
    WEIGHT = None
    WIDTH = None
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
        if name == 'AREA' or name == '0':
            return getattr(MeasurementsType, 'AREA')
        elif name == 'BASE' or name == '1':
            return getattr(MeasurementsType, 'BASE')
        elif name == 'BIT_DEPTH' or name == '2':
            return getattr(MeasurementsType, 'BIT_DEPTH')
        elif name == 'CIRCUMFERENCE' or name == '3':
            return getattr(MeasurementsType, 'CIRCUMFERENCE')
        elif name == 'COUNT' or name == '4':
            return getattr(MeasurementsType, 'COUNT')
        elif name == 'DEPTH' or name == '5':
            return getattr(MeasurementsType, 'DEPTH')
        elif name == 'DIAMETER' or name == '6':
            return getattr(MeasurementsType, 'DIAMETER')
        elif name == 'DISTANCE_BETWEEN' or name == '7':
            return getattr(MeasurementsType, 'DISTANCE_BETWEEN')
        elif name == 'DURATION' or name == '8':
            return getattr(MeasurementsType, 'DURATION')
        elif name == 'FILE_SIZE' or name == '9':
            return getattr(MeasurementsType, 'FILE_SIZE')
        elif name == 'HEIGHT' or name == '10':
            return getattr(MeasurementsType, 'HEIGHT')
        elif name == 'LENGTH' or name == '11':
            return getattr(MeasurementsType, 'LENGTH')
        elif name == 'RESOLUTION' or name == '12':
            return getattr(MeasurementsType, 'RESOLUTION')
        elif name == 'RUNNING_TIME' or name == '13':
            return getattr(MeasurementsType, 'RUNNING_TIME')
        elif name == 'SCALE' or name == '14':
            return getattr(MeasurementsType, 'SCALE')
        elif name == 'SIZE' or name == '15':
            return getattr(MeasurementsType, 'SIZE')
        elif name == 'TARGET' or name == '16':
            return getattr(MeasurementsType, 'TARGET')
        elif name == 'WEIGHT' or name == '17':
            return getattr(MeasurementsType, 'WEIGHT')
        elif name == 'WIDTH' or name == '18':
            return getattr(MeasurementsType, 'WIDTH')
        elif name == 'OTHER' or name == '19':
            return getattr(MeasurementsType, 'OTHER')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (MeasurementsType.AREA, MeasurementsType.BASE, MeasurementsType.BIT_DEPTH, MeasurementsType.CIRCUMFERENCE, MeasurementsType.COUNT, MeasurementsType.DEPTH, MeasurementsType.DIAMETER, MeasurementsType.DISTANCE_BETWEEN, MeasurementsType.DURATION, MeasurementsType.FILE_SIZE, MeasurementsType.HEIGHT, MeasurementsType.LENGTH, MeasurementsType.RESOLUTION, MeasurementsType.RUNNING_TIME, MeasurementsType.SCALE, MeasurementsType.SIZE, MeasurementsType.TARGET, MeasurementsType.WEIGHT, MeasurementsType.WIDTH, MeasurementsType.OTHER,)

MeasurementsType.AREA = MeasurementsType('AREA', 0)
MeasurementsType.BASE = MeasurementsType('BASE', 1)
MeasurementsType.BIT_DEPTH = MeasurementsType('BIT_DEPTH', 2)
MeasurementsType.CIRCUMFERENCE = MeasurementsType('CIRCUMFERENCE', 3)
MeasurementsType.COUNT = MeasurementsType('COUNT', 4)
MeasurementsType.DEPTH = MeasurementsType('DEPTH', 5)
MeasurementsType.DIAMETER = MeasurementsType('DIAMETER', 6)
MeasurementsType.DISTANCE_BETWEEN = MeasurementsType('DISTANCE_BETWEEN', 7)
MeasurementsType.DURATION = MeasurementsType('DURATION', 8)
MeasurementsType.FILE_SIZE = MeasurementsType('FILE_SIZE', 9)
MeasurementsType.HEIGHT = MeasurementsType('HEIGHT', 10)
MeasurementsType.LENGTH = MeasurementsType('LENGTH', 11)
MeasurementsType.RESOLUTION = MeasurementsType('RESOLUTION', 12)
MeasurementsType.RUNNING_TIME = MeasurementsType('RUNNING_TIME', 13)
MeasurementsType.SCALE = MeasurementsType('SCALE', 14)
MeasurementsType.SIZE = MeasurementsType('SIZE', 15)
MeasurementsType.TARGET = MeasurementsType('TARGET', 16)
MeasurementsType.WEIGHT = MeasurementsType('WEIGHT', 17)
MeasurementsType.WIDTH = MeasurementsType('WIDTH', 18)
MeasurementsType.OTHER = MeasurementsType('OTHER', 19)
