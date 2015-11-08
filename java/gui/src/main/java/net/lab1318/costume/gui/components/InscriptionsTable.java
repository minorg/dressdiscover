package net.lab1318.costume.gui.components;

import com.vaadin.data.Item;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.inscription.Inscription;
import net.lab1318.costume.api.models.inscription.InscriptionSet;
import net.lab1318.costume.api.models.inscription.InscriptionText;

@SuppressWarnings("serial")
public final class InscriptionsTable extends Table {
    @SuppressWarnings("unchecked")
    public InscriptionsTable(final InscriptionSet inscriptions) {
        if (inscriptions.getDisplay().isPresent()) {
            setCaption("Inscription: " + inscriptions.getDisplay().get());
        } else {
            setCaption("Inscription");
        }

        boolean haveAuthor = false;
        for (final Inscription inscription : inscriptions.getInscriptions()) {
            if (inscription.getAuthor().isPresent()) {
                haveAuthor = true;
                break;
            }
        }
        if (haveAuthor) {
            addContainerProperty("Author", String.class, null);
        }
        addContainerProperty("Text", String.class, null);
        addContainerProperty("Text Type", String.class, null);

        for (final Inscription inscription : inscriptions.getInscriptions()) {
            for (final InscriptionText text : inscription.getTexts()) {
                final Object itemId = addItem();
                final Item row = getItem(itemId);
                if (inscription.getAuthor().isPresent()) {
                    row.getItemProperty("Author").setValue(inscription.getAuthor().get().getTitle());
                }
                row.getItemProperty("Text").setValue(text.getValue());
                row.getItemProperty("Text Type").setValue(text.getType().name());
            }
        }
    }
}
