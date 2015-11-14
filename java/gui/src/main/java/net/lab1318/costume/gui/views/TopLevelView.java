package net.lab1318.costume.gui.views;

import org.notaweb.gui.EventBus;
import org.notaweb.gui.views.View;

import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Page;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public abstract class TopLevelView extends View {
    protected TopLevelView(final EventBus eventBus) {
        super(eventBus);
    }

    @Override
    public void setComponentError(final ErrorMessage componentError) {
        final Notification notification = new Notification("Error", componentError.getFormattedHtmlMessage(),
                Notification.Type.ERROR_MESSAGE, true);
        notification.show(Page.getCurrent());
    }

    protected final Navbar _getNavbar() {
        return navbar;
    }

    @Override
    protected void setCompositionRoot(final Component compositionRoot) {
        final VerticalLayout frameLayout = new VerticalLayout();
        frameLayout.setSizeFull();
        frameLayout.setSpacing(false);

        {
            frameLayout.addComponent(navbar);
            frameLayout.setComponentAlignment(navbar, Alignment.MIDDLE_CENTER);
        }

        frameLayout.addComponent(new Label("<hr />", ContentMode.HTML));

        {
            frameLayout.addComponent(compositionRoot);
            frameLayout.setComponentAlignment(compositionRoot, Alignment.MIDDLE_CENTER);
        }

        frameLayout.addComponent(new Label("<hr />", ContentMode.HTML));

        super.setCompositionRoot(frameLayout);
    }

    private final Navbar navbar = new Navbar();
}
