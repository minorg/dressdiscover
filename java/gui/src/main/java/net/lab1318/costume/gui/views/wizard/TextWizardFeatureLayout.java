package net.lab1318.costume.gui.views.wizard;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.event.FieldEvents.BlurEvent;
import com.vaadin.event.FieldEvents.BlurListener;
import com.vaadin.event.FieldEvents.FocusEvent;
import com.vaadin.event.FieldEvents.FocusListener;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

import net.lab1318.costume.gui.models.wizard.TextWizardFeature;

@DesignRoot
@SuppressWarnings("serial")
public final class TextWizardFeatureLayout extends VerticalLayout {
    public TextWizardFeatureLayout(final TextWizardFeature feature, final Button nextButton) {
        Design.read(this);

        if (!feature.getSelected().isEmpty()) {
            textField.setValue(feature.getSelected().get(0));
        }
        textField.addValueChangeListener(new ValueChangeListener() {
            @Override
            public void valueChange(final ValueChangeEvent event) {
                feature.resetSelected();
                if (!textField.getValue().isEmpty()) {
                    feature.addSelected(textField.getValue());
                }
            }
        });
        textField.addBlurListener(new BlurListener() {
            @Override
            public void blur(final BlurEvent event) {
                nextButton.removeClickShortcut();
            }
        });
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focus(final FocusEvent event) {
                nextButton.setClickShortcut(KeyCode.ENTER);
            }
        });
        textField.focus();
    }

    TextField textField;
}
