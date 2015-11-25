package net.lab1318.costume.gui.components;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.subject.Subject;
import net.lab1318.costume.api.models.subject.SubjectSet;
import net.lab1318.costume.api.models.subject.SubjectTerm;
import net.lab1318.costume.gui.GuiUI;
import net.lab1318.costume.gui.models.subject.SubjectTermBean;

@SuppressWarnings("serial")
public final class SubjectSetTable extends ElementSetTable {
    public SubjectSetTable(final SubjectSet subjects) {
        super("Subjects", subjects);

        final BeanItemContainer<SubjectTermBean> container = new BeanItemContainer<>(SubjectTermBean.class);
        for (final Subject subject : subjects.getSubjects()) {
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
                        GuiUI.navigateTo(ObjectQuery.builder().setIncludeSubjectTermText(subjectTermText).build());
                    }
                });
                button.addStyleName("borderlessButton");
                return button;
            }
        });
        setPageLength(subjects.getSubjects().size());
        setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
        final List<Object> visibleColumns = new ArrayList<>();
        visibleColumns.add(SubjectTerm.FieldMetadata.TEXT.getJavaName());
        setVisibleColumns(visibleColumns.toArray());
    }
}
