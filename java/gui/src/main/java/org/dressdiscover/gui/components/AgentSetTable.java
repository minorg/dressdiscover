package org.dressdiscover.gui.components;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;

import org.dressdiscover.api.models.agent.Agent;
import org.dressdiscover.api.models.agent.AgentName;
import org.dressdiscover.api.models.agent.AgentRole;
import org.dressdiscover.api.models.agent.AgentSet;
import org.dressdiscover.gui.models.agent.AgentBean;

@SuppressWarnings("serial")
final class AgentSetTable extends ElementSetTable {
    public AgentSetTable(final AgentSet agents) {
        super("Agents", agents);

        final BeanItemContainer<AgentBean> container = new BeanItemContainer<>(AgentBean.class);
        for (final Agent agent : agents.getElements()) {
            container.addBean(new AgentBean(agent));
        }
        container.addNestedContainerBean(Agent.FieldMetadata.NAME.getJavaName());
        container.addNestedContainerBean(Agent.FieldMetadata.ROLE.getJavaName());
        setContainerDataSource(container);

        setPageLength(agents.getElements().size());
        setVisibleColumns(ImmutableList
                .of(Agent.FieldMetadata.NAME.getJavaName() + '.' + AgentName.FieldMetadata.TEXT.getJavaName(),
                        Agent.FieldMetadata.ROLE.getJavaName() + '.' + AgentRole.FieldMetadata.TEXT.getJavaName())
                .toArray());
        setColumnHeaders("Name", "Role");
    }
}
