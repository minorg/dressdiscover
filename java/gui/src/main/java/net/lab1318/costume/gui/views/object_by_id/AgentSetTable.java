package net.lab1318.costume.gui.views.object_by_id;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.agent.Agent;
import net.lab1318.costume.api.models.agent.AgentName;
import net.lab1318.costume.api.models.agent.AgentRole;
import net.lab1318.costume.api.models.agent.AgentSet;
import net.lab1318.costume.api.services.object.ObjectFacetFilters;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.gui.GuiUI;
import net.lab1318.costume.gui.models.agent.AgentBean;

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

        addGeneratedColumn(Agent.FieldMetadata.NAME.getJavaName() + '.' + AgentName.FieldMetadata.TEXT.getJavaName(),
                new ColumnGenerator() {
                    @Override
                    public Object generateCell(final Table source, final Object itemId, final Object columnId) {
                        final String agentNameText = (String) container.getItem(itemId).getItemProperty(columnId)
                                .getValue();
                        return new NativeButton(agentNameText, new Button.ClickListener() {
                            @Override
                            public void buttonClick(final ClickEvent event) {
                                GuiUI.navigateTo(ObjectQuery.builder()
                                        .setFacetFilters(ObjectFacetFilters.builder()
                                                .setIncludeAgentNameTexts(ImmutableSet.of(agentNameText)).build())
                                        .build());
                            }
                        });
                    }
                });
        setPageLength(agents.getElements().size());
        setVisibleColumns(ImmutableList
                .of(Agent.FieldMetadata.NAME.getJavaName() + '.' + AgentName.FieldMetadata.TEXT.getJavaName(),
                        Agent.FieldMetadata.ROLE.getJavaName() + '.' + AgentRole.FieldMetadata.TEXT.getJavaName())
                .toArray());
        setColumnHeaders("Name", "Role");
    }
}