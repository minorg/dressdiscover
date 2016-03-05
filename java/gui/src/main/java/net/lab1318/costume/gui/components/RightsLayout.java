package net.lab1318.costume.gui.components;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.CellStyleGenerator;
import com.vaadin.ui.Table.ColumnHeaderMode;

import net.lab1318.costume.api.models.rights.RightsSet;
import net.lab1318.costume.gui.models.rights.RightsBean;
import net.lab1318.costume.gui.models.rights.RightsSetBean;

@SuppressWarnings("serial")
public final class RightsLayout extends CustomComponent {
    public RightsLayout(final String entity, final RightsSet model) {
        this(entity, new RightsSetBean(model));
    }

    public RightsLayout(final String entity, final RightsSetBean model) {
        int rightsRowCount = 0;
        for (final RightsBean rights_ : model.getElements()) {
            rightsRowCount++;
            if (rights_.getRightsHolder() != null) {
                rightsRowCount++;
            }
        }
        if (rightsRowCount == 0) {
            empty = true;
            return;
        }

        final Table table = new Table();
        table.addContainerProperty("caption", String.class, null);
        table.addContainerProperty("text", String.class, null);
        table.setCellStyleGenerator(new CellStyleGenerator() {
            @Override
            public String getStyle(final Table source, final Object itemId, final Object propertyId) {
                return propertyId != null ? "rights-" + propertyId.toString() : null;
            }
        });
        // rootTable.addGeneratedColumn("text", new ColumnGenerator() {
        // @Override
        // public Object generateCell(final Table source, final Object itemId,
        // final Object columnId) {
        // final Object value =
        // source.getItem(itemId).getItemProperty(columnId).getValue();
        // if (value == null) {
        // return null;
        // }
        // return value;
        // }
        // });
        table.setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
        table.setPageLength(rightsRowCount);
        table.setStyleName("rights-table");

        boolean empty = true;
        for (final RightsBean rights_ : model.getElements()) {
            String typeCaption;
            Object typeText;
            switch (rights_.getType()) {
            case COPYRIGHTED:
                typeCaption = "Copyright";
                typeText = rights_.getText().trim();
                break;
            case LICENSED:
                typeCaption = "License";
                // if (rights_.getLicenseVocabRef() != null &&
                // rights_.getLicenseVocabRef().getUri() instanceof Url) {
                // typeText = new Link(rights_.getText().trim(),
                // new
                // ExternalResource(rights_.getLicenseVocabRef().getUri().toString()));
                // } else {
                typeText = rights_.getText().trim();
                // }
                break;
            case OTHER:
                continue;
            case PUBLIC_DOMAIN:
                typeCaption = "License";
                typeText = "public domain";
                break;
            case UNDETERMINED:
                continue;
            default:
                throw new UnsupportedOperationException();
            }

            table.addItem(new Object[] { typeCaption, typeText }, null);
            empty = false;

            if (rights_.getRightsHolder() != null) {
                table.addItem(new Object[] { "Rights holder", rights_.getRightsHolder() }, null);
            }
        }
        this.empty = empty;
        if (empty) {
            return;
        }

        final Panel panel = new Panel();
        panel.setCaption(entity + " rights");
        panel.setContent(table);

        setCompositionRoot(panel);
        addStyleName("rights-layout");
    }

    public final boolean isEmpty() {
        return empty;
    }

    private final boolean empty;
}
