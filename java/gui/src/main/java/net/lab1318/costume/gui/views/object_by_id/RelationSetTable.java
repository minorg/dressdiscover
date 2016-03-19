package net.lab1318.costume.gui.views.object_by_id;

import org.thryft.waf.gui.EventBus;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.relation.Relation;
import net.lab1318.costume.api.models.relation.RelationSet;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService.Messages.GetObjectSummariesRequest;
import net.lab1318.costume.gui.models.relation.RelationBean;

@SuppressWarnings("serial")
final class RelationSetTable extends ElementSetTable {
    public RelationSetTable(final EventBus eventBus, final InstitutionId institutionId, final RelationSet relations) {
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
                final Button button = new Button(relationText, new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        eventBus.post(GetObjectSummariesRequest.builder().setQuery(ObjectQuery.builder()
                                .setInstitutionId(institutionId).setRelationText(relationText).build()).build());
                    }
                });
                button.setStyleName("relation-button");
                return button;
            }
        });

        setPageLength(relations.getElements().size());
        setVisibleColumns(ImmutableList
                .of(Relation.FieldMetadata.TYPE.getJavaName(), Relation.FieldMetadata.TEXT.getJavaName()).toArray());
        setColumnHeaders("Type", "Text");
    }
}
