package net.lab1318.costume.gui.views.institution;

import org.notaweb.gui.EventBus;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.data.util.BeanContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnGenerator;

import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.gui.models.institution.InstitutionEntryBean;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class InstitutionsView extends TopLevelView {
    @Inject
    public InstitutionsView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setInstitutions(final ImmutableList<InstitutionEntry> institutions) {
        final BeanContainer<String, InstitutionEntryBean> container = new BeanContainer<>(InstitutionEntryBean.class);
        container.addNestedContainerProperty("model.title");
        container.setBeanIdProperty("id");
        for (final InstitutionEntry institution : institutions) {
            container.addBean(new InstitutionEntryBean(institution));
        }
        final Table table = new Table();
        table.addGeneratedColumn("id", new ColumnGenerator() {
            @Override
            public Object generateCell(final Table source, final Object itemId, final Object columnId) {
                final InstitutionId institutionId = (InstitutionId) source.getItem(itemId).getItemProperty(columnId)
                        .getValue();
                return new Button(institutionId.toString(), new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        _getEventBus()
                                .post(new InstitutionQueryService.Messages.GetInstitutionByIdRequest(institutionId));
                    }
                });
            }
        });
        table.setColumnHeader("model.title", "Name");
        table.setContainerDataSource(container);
        table.setVisibleColumns("id", "model.title");
        setCompositionRoot(table);
    }

    public final static String NAME = "institutions";
}
