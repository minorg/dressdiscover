package net.lab1318.costume.gui.views.object;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.relation.Relation;
import net.lab1318.costume.api.models.relation.RelationSet;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.gui.GuiUI;
import net.lab1318.costume.gui.models.relation.RelationBean;

@SuppressWarnings("serial")
final class RelationSetTable extends ElementSetTable {
    public RelationSetTable(final InstitutionId institutionId, final RelationSet relations) {
        super("Relations", relations);

        final BeanItemContainer<RelationBean> container = new BeanItemContainer<>(RelationBean.class);
        for (final Relation relation : relations.getElements()) {
            if (!relation.getText().isPresent()) {
                continue;
            }
            container.addBean(new RelationBean(relation));
        }
        setContainerDataSource(container);

        addGeneratedColumn(Relation.FieldMetadata.TEXT.getJavaName(), new ColumnGenerator() {
            @Override
            public Object generateCell(final Table source, final Object itemId, final Object columnId) {
                final String relationText = (String) container.getItem(itemId).getItemProperty(columnId).getValue();
                if (relationText.isEmpty()) {
                    return new Label();
                }
                return new NativeButton(relationText, new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        GuiUI.navigateTo(ObjectQuery.builder().setInstitutionId(institutionId)
                                .setRelationText(relationText).build());
                    }
                });
            }
        });

        setPageLength(relations.getElements().size());
        setVisibleColumns(ImmutableList
                .of(Relation.FieldMetadata.TYPE.getJavaName(), Relation.FieldMetadata.TEXT.getJavaName()).toArray());
        setColumnHeaders("Type", "Text");
    }
}
