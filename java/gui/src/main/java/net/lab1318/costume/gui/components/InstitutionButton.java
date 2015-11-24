package net.lab1318.costume.gui.components;

import org.notaweb.gui.EventBus;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;

import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;

@SuppressWarnings("serial")
public final class InstitutionButton extends CustomComponent {
    public InstitutionButton(final String captionPrefix, final String captionSuffix, final EventBus eventBus,
            final InstitutionEntry institutionEntry) {
        final Button institutionButton = new Button(
                captionPrefix + institutionEntry.getModel().getTitle() + captionSuffix, new Button.ClickListener() {
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
