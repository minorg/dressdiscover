class ImageType(object):
    FULL_SIZE = None
    ORIGINAL = None
    SQUARE_THUMBNAIL = None
    THUMBNAIL = None

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
        if name == 'FULL_SIZE' or name == '0':
            return getattr(ImageType, 'FULL_SIZE')
        elif name == 'ORIGINAL' or name == '1':
            return getattr(ImageType, 'ORIGINAL')
        elif name == 'SQUARE_THUMBNAIL' or name == '2':
            return getattr(ImageType, 'SQUARE_THUMBNAIL')
        elif name == 'THUMBNAIL' or name == '3':
            return getattr(ImageType, 'THUMBNAIL')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (ImageType.FULL_SIZE, ImageType.ORIGINAL, ImageType.SQUARE_THUMBNAIL, ImageType.THUMBNAIL,)

ImageType.FULL_SIZE = ImageType('FULL_SIZE', 0)
ImageType.ORIGINAL = ImageType('ORIGINAL', 1)
ImageType.SQUARE_THUMBNAIL = ImageType('SQUARE_THUMBNAIL', 2)
ImageType.THUMBNAIL = ImageType('THUMBNAIL', 3)
