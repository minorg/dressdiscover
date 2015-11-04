package net.lab1318.costume.gui.components;

import org.notaweb.gui.EventBus;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;

import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;

@SuppressWarnings("serial")
public final class InstitutionHeader extends CustomComponent {
    public InstitutionHeader(final EventBus eventBus, final InstitutionEntry institutionEntry) {
        final Button institutionButton = new Button("Institution: " + institutionEntry.getModel().getTitle(),
                new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        eventBus.post(new InstitutionQueryService.Messages.GetInstitutionByIdRequest(
                                institutionEntry.getId()));
                    }
                });
        institutionButton.addStyleName("borderlessButton");
        setCompositionRoot(institutionButton);
    }
}
