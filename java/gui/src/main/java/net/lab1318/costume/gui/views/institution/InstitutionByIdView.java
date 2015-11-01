package net.lab1318.costume.gui.views.institution;

import org.notaweb.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;

import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class InstitutionByIdView extends TopLevelView {
    @Inject
    public InstitutionByIdView(final EventBus eventBus) {
        super(eventBus);
    }

    public final static String NAME = "institution_by_id";
}
