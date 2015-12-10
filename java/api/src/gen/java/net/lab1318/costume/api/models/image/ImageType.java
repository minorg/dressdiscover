package net.lab1318.costume.api.models.image;

public enum ImageType {
    FULL_SIZE(0),
    ORIGINAL(1),
    SQUARE_THUMBNAIL(2),
    THUMBNAIL(3);

    private ImageType(int value) {
        this.value = value;
    }

    public static ImageType valueOf(final int value) {
        switch (value) {
        case 0: return FULL_SIZE;
        case 1: return ORIGINAL;
        case 2: return SQUARE_THUMBNAIL;
        case 3: return THUMBNAIL;
        default: throw new IllegalArgumentException();
        }
    }

    public static ImageType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
