package net.lab1318.costume.gui.views.institution;

import org.notaweb.gui.EventBus;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.GridLayout;

import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class InstitutionsView extends TopLevelView {
    @Inject
    public InstitutionsView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final ImmutableList<InstitutionEntry> institutionEntries) {
        final GridLayout rootLayout = new GridLayout();
        for (final InstitutionEntry institutionEntry : institutionEntries) {
            final Button institutionButton = new Button(institutionEntry.getModel().getTitle(),
                    new Button.ClickListener() {
                        @Override
                        public void buttonClick(final ClickEvent event) {
                            _getEventBus().post(new InstitutionQueryService.Messages.GetInstitutionByIdRequest(
                                    institutionEntry.getId()));
                        }
                    });
            rootLayout.addComponent(institutionButton);
        }
        setCompositionRoot(rootLayout);
    }

    public final static String NAME = "institutions";
}
