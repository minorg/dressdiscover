package org.dressdiscover.gui.converters;

import org.dressdiscover.api.models.institution.InstitutionId;
import org.thryft.waf.gui.utils.ThryftConverterFactory;

import com.vaadin.data.util.converter.Converter;

@SuppressWarnings("serial")
public final class CustomConverterFactory extends ThryftConverterFactory {
    public static CustomConverterFactory getInstance() {
        return instance;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected <PRESENTATION, MODEL> Converter<PRESENTATION, MODEL> findConverter(
            final Class<PRESENTATION> presentationType, final Class<MODEL> modelType) {
        if (presentationType == String.class) {
            if (modelType == InstitutionId.class) {
                return (Converter<PRESENTATION, MODEL>) StringToInstitutionIdConverter.getInstance();
            }
        }
        return super.findConverter(presentationType, modelType);
    }

    private final static CustomConverterFactory instance = new CustomConverterFactory();
}
