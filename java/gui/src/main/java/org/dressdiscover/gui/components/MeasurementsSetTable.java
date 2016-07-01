package org.dressdiscover.gui.components;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;

import org.dressdiscover.api.models.measurements.Measurements;
import org.dressdiscover.api.models.measurements.MeasurementsSet;
import org.dressdiscover.gui.models.measurements.MeasurementsBean;

@SuppressWarnings("serial")
final class MeasurementsSetTable extends ElementSetTable {
    public MeasurementsSetTable(final MeasurementsSet measurementsSet) {
        super("Measurements", measurementsSet);

        final BeanItemContainer<MeasurementsBean> container = new BeanItemContainer<>(MeasurementsBean.class);
        for (final Measurements measurements : measurementsSet.getElements()) {
            container.addBean(new MeasurementsBean(measurements));
        }
        setContainerDataSource(container);
        setPageLength(container.size());
        setVisibleColumns(ImmutableList.of(MeasurementsBean.FieldMetadata.TYPE.getJavaName(),
                MeasurementsBean.FieldMetadata.TEXT.getJavaName(), MeasurementsBean.FieldMetadata.UNIT.getJavaName(),
                MeasurementsBean.FieldMetadata.EXTENT.getJavaName()).toArray());
        setColumnHeaders("Type", "Text", "Unit", "Extent");
    }
}
