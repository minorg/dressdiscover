package net.lab1318.costume.gui.views.wizard;

import org.thryft.waf.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;

import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class WizardView extends TopLevelView {
	@Inject
	public WizardView(final EventBus eventBus) {
		super(eventBus);
	}

	public final static String NAME = "wizard";
}
