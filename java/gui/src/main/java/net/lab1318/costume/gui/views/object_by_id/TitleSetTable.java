package net.lab1318.costume.gui.views.object_by_id;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;

import net.lab1318.costume.api.models.title.Title;
import net.lab1318.costume.api.models.title.TitleSet;
import net.lab1318.costume.gui.models.title.TitleBean;

@SuppressWarnings("serial")
final class TitleSetTable extends ElementSetTable {
    public TitleSetTable(final TitleSet titles) {
        super("Titles", titles);
        final BeanItemContainer<TitleBean> container = new BeanItemContainer<>(TitleBean.class);

        // Preferred titles first
        for (final Title title : titles.getElements()) {
            if (title.getPref().or(Boolean.FALSE)) {
                container.addBean(new TitleBean(title));
            }
        }
        for (final Title title : titles.getElements()) {
            if (!title.getPref().or(Boolean.FALSE)) {
                container.addBean(new TitleBean(title));
            }
        }
        setContainerDataSource(container);
        setPageLength(container.size());
        setVisibleColumns(ImmutableList.of(Title.FieldMetadata.TYPE.getJavaName(),
                Title.FieldMetadata.TEXT.getJavaName(), Title.FieldMetadata.PREF.getJavaName()).toArray());
        setColumnHeaders("Type", "Text", "Preferred?");
    }
}
