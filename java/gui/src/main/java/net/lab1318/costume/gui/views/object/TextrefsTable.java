package net.lab1318.costume.gui.views.object;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.textref.Textref;
import net.lab1318.costume.api.models.textref.TextrefName;
import net.lab1318.costume.api.models.textref.TextrefRefid;
import net.lab1318.costume.api.models.textref.TextrefRefidType;
import net.lab1318.costume.api.models.textref.TextrefSet;
import net.lab1318.costume.gui.models.textref.TextrefBean;

@SuppressWarnings("serial")
final class TextrefsTable extends ElementSetTable {
    public TextrefsTable(final TextrefSet textrefs) {
        super("Identifiers", textrefs);

        final BeanItemContainer<TextrefBean> container = new BeanItemContainer<>(TextrefBean.class);
        for (final Textref textref : textrefs.getElements()) {
            container.addBean(new TextrefBean(textref));
        }
        container.addNestedContainerBean(Textref.FieldMetadata.NAME.getJavaName());
        container.addNestedContainerBean(Textref.FieldMetadata.REFID.getJavaName());
        setContainerDataSource(container);

        addGeneratedColumn(
                Textref.FieldMetadata.REFID.getJavaName() + '.' + TextrefRefid.FieldMetadata.TEXT.getJavaName(),
                new ColumnGenerator() {
                    @Override
                    public Object generateCell(final Table source, final Object itemId, final Object columnId) {
                        final TextrefBean textref = container.getItem(itemId).getBean();
                        final String refidText = (String) container.getItem(itemId).getItemProperty(columnId)
                                .getValue();
                        if (textref.getRefid().getType() == TextrefRefidType.URI
                                && textref.getRefid().getHref() != null) {
                            return new Link(refidText, new ExternalResource(textref.getRefid().getHref().toString()));
                        } else {
                            return new Label(refidText);
                        }
                    }
                });

        setPageLength(textrefs.getElements().size());
        setVisibleColumns(ImmutableList
                .of(Textref.FieldMetadata.NAME.getJavaName() + '.' + TextrefName.FieldMetadata.TEXT.getJavaName(),
                        Textref.FieldMetadata.NAME.getJavaName() + '.' + TextrefName.FieldMetadata.TYPE.getJavaName(),
                        Textref.FieldMetadata.REFID.getJavaName() + '.' + TextrefName.FieldMetadata.TEXT.getJavaName(),
                        Textref.FieldMetadata.REFID.getJavaName() + '.' + TextrefName.FieldMetadata.TYPE.getJavaName())
                .toArray());
        setColumnHeaders("Name", "Name type", "Reference", "Reference type");
    }
}
