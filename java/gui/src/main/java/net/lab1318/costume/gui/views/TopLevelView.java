package net.lab1318.costume.gui.views;

import org.thryft.waf.gui.EventBus;
import org.thryft.waf.gui.views.View;

import com.google.common.base.Optional;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Page;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.gui.views.wizard.WizardFeatureView;

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
        frameLayout.setSizeFull();
        frameLayout.setSpacing(false);

        frameLayout.addComponent(navbar);

        frameLayout.addComponent(new Label("<hr />", ContentMode.HTML));

        frameLayout.addComponent(compositionRoot);

        frameLayout.addComponent(new Label("<hr />", ContentMode.HTML));

        {
            final HorizontalLayout footerLayout = new HorizontalLayout();
            footerLayout.setSizeFull();
            {
                final Button piButton = new NativeButton();
                piButton.setCaption("&Pi;");
                piButton.setCaptionAsHtml(true);
                piButton.addClickListener(new ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        UI.getCurrent().getNavigator().navigateTo(WizardFeatureView.NAME);
                    }
                });
                piButton.setStyleName("pi");
                footerLayout.addComponent(piButton);
                footerLayout.setComponentAlignment(piButton, Alignment.MIDDLE_RIGHT);
            }
            frameLayout.addComponent(footerLayout);
        }

        super.setCompositionRoot(frameLayout);
    }

    private final Navbar navbar;
}
