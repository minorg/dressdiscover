package net.lab1318.costume.gui.views.object;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableSet;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.agent.Agent;
import net.lab1318.costume.api.models.agent.AgentName;
import net.lab1318.costume.api.models.agent.AgentSet;
import net.lab1318.costume.api.models.object.ObjectFilters;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.gui.GuiUI;
import net.lab1318.costume.gui.models.agent.AgentBean;

@SuppressWarnings("serial")
final class AgentSetTable extends ElementSetTable {
	public AgentSetTable(final AgentSet agents) {
		super("Agents", agents);

		final BeanItemContainer<AgentBean> container = new BeanItemContainer<>(AgentBean.class);
		for (final Agent agent : agents.getAgents()) {
			container.addBean(new AgentBean(agent));
		}
		container.addNestedContainerBean(Agent.FieldMetadata.NAME.getJavaName());
		setContainerDataSource(container);

		addGeneratedColumn(Agent.FieldMetadata.NAME.getJavaName() + '.' + AgentName.FieldMetadata.TEXT.getJavaName(),
				new ColumnGenerator() {
					@Override
					public Object generateCell(final Table source, final Object itemId, final Object columnId) {
						final String agentNameText = (String) container.getItem(itemId).getItemProperty(columnId)
								.getValue();
						final Button button = new Button(agentNameText, new Button.ClickListener() {
							@Override
							public void buttonClick(final ClickEvent event) {
								GuiUI.navigateTo(ObjectQuery.builder()
										.setFilters(ObjectFilters.builder()
												.setIncludeAgentNameTexts(ImmutableSet.of(agentNameText)).build())
										.build());
							}
						});
						button.addStyleName("borderlessButton");
						return button;
					}
				});
		setPageLength(agents.getAgents().size());
		// setColumnHeader(Agent.FieldMetadata.NAME.getJavaName() + '.' +
		// AgentName.FieldMetadata.TEXT.getJavaName(),
		// "Name");
		setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
		final List<Object> visibleColumns = new ArrayList<>();
		visibleColumns.add(Agent.FieldMetadata.NAME.getJavaName() + '.' + AgentName.FieldMetadata.TEXT.getJavaName());
		setVisibleColumns(visibleColumns.toArray());
	}
}
