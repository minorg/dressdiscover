package org.dressdiscover.gui.models.gender;

import net.lab1318.costume.api.models.gender.Gender;

public final class Genders {
    public static String getCaption(final Gender gender) {
        switch (gender) {
        case FEMALE:
            return "Female";
        case MALE:
            return "Male";
        default:
            throw new UnsupportedOperationException();
        }
    }

    private Genders() {
    }
}
