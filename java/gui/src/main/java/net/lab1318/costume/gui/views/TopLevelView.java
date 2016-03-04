package net.lab1318.costume.gui.views;

import org.thryft.waf.gui.EventBus;
import org.thryft.waf.gui.views.View;

import com.google.common.base.Optional;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Page;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.gui.components.Navbar;

@SuppressWarnings("serial")
public abstract class TopLevelView extends View {
    protected TopLevelView(final EventBus eventBus) {
        super(eventBus);
        navbar = new Navbar(eventBus);
    }

    @Override
    public void setComponentError(final ErrorMessage componentError) {
        final Notification notification = new Notification("Error", componentError.getFormattedHtmlMessage(),
                Notification.Type.ERROR_MESSAGE, true);
        notification.show(Page.getCurrent());
    }

    public void setCurrentUser(final Optional<UserEntry> currentUser) {
        navbar.setCurrentUser(currentUser);
    }

    protected final Navbar _getNavbar() {
        return navbar;
    }

    @Override
    protected void setCompositionRoot(final Component compositionRoot) {
        final VerticalLayout frameLayout = new VerticalLayout();
        frameLayout.setStyleName("top-level-view-frame");

        frameLayout.addComponent(navbar);

        frameLayout.addComponent(new Label("<hr />", ContentMode.HTML));

        final VerticalLayout bodyLayout = new VerticalLayout();
        bodyLayout.addComponent(compositionRoot);
        bodyLayout.setStyleName("top-level-view-body");
        frameLayout.addComponent(bodyLayout);

        frameLayout.addComponent(new Label("<hr />", ContentMode.HTML));

        super.setCompositionRoot(frameLayout);
    }

    private final Navbar navbar;
}
