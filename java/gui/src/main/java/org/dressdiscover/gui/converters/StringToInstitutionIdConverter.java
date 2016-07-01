package org.dressdiscover.gui.converters;

import java.util.Locale;

import org.dressdiscover.api.models.institution.InstitutionId;

import com.vaadin.data.util.converter.Converter;

import org.dressdiscover.api.models.institution.InvalidInstitutionIdException;

@SuppressWarnings("serial")
final class StringToInstitutionIdConverter implements Converter<String, InstitutionId> {
    public static StringToInstitutionIdConverter getInstance() {
        return instance;
    }

    @Override
    public InstitutionId convertToModel(final String value, final Class<? extends InstitutionId> targetType,
            final Locale locale) throws com.vaadin.data.util.converter.Converter.ConversionException {
        if (value != null) {
            try {
                return InstitutionId.parse(value);
            } catch (final InvalidInstitutionIdException e) {
                throw new ConversionException(e);
            }
        } else {
            return null;
        }
    }

    @Override
    public String convertToPresentation(final InstitutionId value, final Class<? extends String> targetType,
            final Locale locale) throws com.vaadin.data.util.converter.Converter.ConversionException {
        if (value != null) {
            return value.toString();
        } else {
            return null;
        }
    }

    @Override
    public Class<InstitutionId> getModelType() {
        return InstitutionId.class;
    }

    @Override
    public Class<String> getPresentationType() {
        return String.class;
    }

    private final static StringToInstitutionIdConverter instance = new StringToInstitutionIdConverter();
}
