package org.dressdiscover.gui.models.object;

import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.gui.models.object.ObjectSummaryBean;
import org.dressdiscover.gui.models.object.ObjectSummaryEntryBean;
import org.vaadin.addons.lazyquerycontainer.LazyQueryDefinition;

import net.lab1318.costume.api.services.object.ObjectSummarySortField;

@SuppressWarnings("serial")
public final class ObjectSummaryEntryBeanQueryDefinition extends LazyQueryDefinition {
    public static ObjectSummaryEntryBeanQueryDefinition getInstance() {
        return instance;
    }

    private ObjectSummaryEntryBeanQueryDefinition() {
        super(true, 10, ObjectSummaryEntryBean.FieldMetadata.ID.getJavaName());
        addProperty(ObjectSummaryEntryBean.FieldMetadata.ID.getJavaName(), ObjectId.class, null, true, false);

        for (final ObjectSummaryBean.FieldMetadata field : ObjectSummaryBean.FieldMetadata.values()) {
            boolean sortable = false;
            try {
                ObjectSummarySortField.valueOf(field.getThriftName().toUpperCase());
                sortable = true;
            } catch (final IllegalArgumentException e) {
            }

            addProperty(ObjectSummaryEntryBean.FieldMetadata.MODEL.getJavaName() + '.' + field.getJavaName(),
                    field.getJavaType().getRawType(), null, true, sortable);
        }
        setMaxNestedPropertyDepth(1);
    }

    private final static ObjectSummaryEntryBeanQueryDefinition instance = new ObjectSummaryEntryBeanQueryDefinition();
}
