package org.dressdiscover.gui.components;

import java.util.ArrayList;
import java.util.List;

import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.gui.events.object_by_id.ObjectElementSelectionRequest;
import org.thryft.waf.gui.EventBus;

import com.google.common.collect.ImmutableSet;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Table;

import org.dressdiscover.api.models.object.ObjectFacetFilters;
import org.dressdiscover.api.models.subject.Subject;
import org.dressdiscover.api.models.subject.SubjectSet;
import org.dressdiscover.api.models.subject.SubjectTerm;
import org.dressdiscover.gui.models.subject.SubjectTermBean;

@SuppressWarnings("serial")
final class SubjectSetTable extends ElementSetTable {
    public SubjectSetTable(final EventBus eventBus, final ObjectId objectId, final SubjectSet subjects) {
        super("Subjects", subjects);

        final BeanItemContainer<SubjectTermBean> container = new BeanItemContainer<>(SubjectTermBean.class);
        for (final Subject subject : subjects.getElements()) {
            for (final SubjectTerm term : subject.getTerms()) {
                container.addBean(new SubjectTermBean(term));
            }
        }
        setContainerDataSource(container);
        addGeneratedColumn(SubjectTerm.FieldMetadata.TEXT.getJavaName(), new ColumnGenerator() {
            @Override
            public Object generateCell(final Table source, final Object itemId, final Object columnId) {
                final String subjectTermText = (String) container.getItem(itemId).getItemProperty(columnId).getValue();
                final Button button = new Button(subjectTermText, new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        eventBus.post(new ObjectElementSelectionRequest(
                                ObjectFacetFilters.builder()
                                        .setIncludeSubjectTermTexts(ImmutableSet.of(subjectTermText)).build(),
                                objectId));
                    }
                });
                button.setStyleName("subject-button");
                return button;
            }
        });
        setPageLength(getContainerDataSource().size());
        setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
        final List<Object> visibleColumns = new ArrayList<>();
        visibleColumns.add(SubjectTerm.FieldMetadata.TEXT.getJavaName());
        setVisibleColumns(visibleColumns.toArray());
    }
}
