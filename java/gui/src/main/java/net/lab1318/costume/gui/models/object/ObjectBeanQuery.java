package net.lab1318.costume.gui.models.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.vaadin.addons.lazyquerycontainer.AbstractBeanQuery;
import org.vaadin.addons.lazyquerycontainer.QueryDefinition;

import com.google.common.base.Optional;
import com.google.common.primitives.UnsignedInteger;

import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.GetObjectsOptions;
import net.lab1318.costume.api.services.object.ObjectQueryService;

@SuppressWarnings("serial")
public final class ObjectBeanQuery extends AbstractBeanQuery<ObjectBeanWithId> {
    public ObjectBeanQuery(final QueryDefinition definition, final Map<String, java.lang.Object> queryConfiguration,
            final java.lang.Object[] sortPropertyIds, final boolean[] sortStates) {
        super(definition, queryConfiguration, sortPropertyIds, sortStates);
        this.objectQuery = Optional.of((ObjectQuery) queryConfiguration.get("objectQuery"));
        this.objectQueryService = (ObjectQueryService) queryConfiguration.get("objectQueryService");
    }

    @Override
    public int size() {
        try {
            return objectQueryService.getObjectCount(objectQuery).intValue();
        } catch (final IoException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected ObjectBeanWithId constructBean() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected List<ObjectBeanWithId> loadBeans(final int startIndex, final int count) {
        final List<ObjectBeanWithId> beans = new ArrayList<>();
        try {
            for (final ObjectEntry entry : objectQueryService.getObjects(GetObjectsOptions.builder()
                    .setFrom(UnsignedInteger.valueOf(startIndex)).setSize(UnsignedInteger.valueOf(count)).build(),
                    objectQuery)) {
                beans.add(new ObjectBeanWithId(entry));
            }
        } catch (final IoException e) {
            throw new RuntimeException(e);
        }
        return beans;
    }

    @Override
    protected void saveBeans(final List<ObjectBeanWithId> added, final List<ObjectBeanWithId> modified,
            final List<ObjectBeanWithId> removed) {
        throw new UnsupportedOperationException();
    }

    private final Optional<ObjectQuery> objectQuery;
    private final ObjectQueryService objectQueryService;
}