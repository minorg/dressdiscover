package org.dressdiscover.gui.components;

import com.google.common.base.CaseFormat;
import com.vaadin.data.Item;

import org.dressdiscover.api.models.inscription.Inscription;
import org.dressdiscover.api.models.inscription.InscriptionSet;
import org.dressdiscover.api.models.inscription.InscriptionText;

@SuppressWarnings("serial")
final class InscriptionSetTable extends ElementSetTable {
    @SuppressWarnings("unchecked")
    public InscriptionSetTable(final InscriptionSet inscriptions) {
        super("Inscriptions", inscriptions);

        boolean haveAuthor = false;
        for (final Inscription inscription : inscriptions.getElements()) {
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

        int rowCount = 0;
        for (final Inscription inscription : inscriptions.getElements()) {
            for (final InscriptionText text : inscription.getTexts()) {
                final Object itemId = addItem();
                final Item row = getItem(itemId);
                if (inscription.getAuthor().isPresent()) {
                    row.getItemProperty("Author").setValue(inscription.getAuthor().get().getText());
                }
                row.getItemProperty("Text").setValue(text.getText());
                row.getItemProperty("Text Type")
                        .setValue(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, text.getType().name()));
                rowCount++;
            }
        }
        setPageLength(rowCount);
    }
}
