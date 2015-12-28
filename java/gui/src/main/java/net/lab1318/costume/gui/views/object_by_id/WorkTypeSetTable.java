package net.lab1318.costume.gui.views.object_by_id;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.work_type.WorkType;
import net.lab1318.costume.api.models.work_type.WorkTypeSet;
import net.lab1318.costume.api.services.object.ObjectFacetFilters;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.gui.GuiUI;
import net.lab1318.costume.gui.models.work_type.WorkTypeBean;

@SuppressWarnings("serial")
final class WorkTypeSetTable extends ElementSetTable {
    public WorkTypeSetTable(final WorkTypeSet workTypes) {
        super("Work types", workTypes);

        final BeanItemContainer<WorkTypeBean> container = new BeanItemContainer<>(WorkTypeBean.class);
        for (final WorkType workType : workTypes.getElements()) {
            container.addBean(new WorkTypeBean(workType));
        }
        setContainerDataSource(container);
        addGeneratedColumn(WorkType.FieldMetadata.TEXT.getJavaName(), new ColumnGenerator() {
            @Override
            public Object generateCell(final Table source, final Object itemId, final Object columnId) {
                final String text = (String) container.getItem(itemId).getItemProperty(columnId).getValue();
                final Button button = new NativeButton(text, new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        GuiUI.navigateTo(ObjectQuery.builder().setFacetFilters(
                                ObjectFacetFilters.builder().setIncludeWorkTypeTexts(ImmutableSet.of(text)).build())
                                .build());
                    }
                });
                return button;
            }
        });
        setPageLength(workTypes.getElements().size());
        setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
        setVisibleColumns(ImmutableList.of(WorkType.FieldMetadata.TEXT.getJavaName()).toArray());
    }
}
