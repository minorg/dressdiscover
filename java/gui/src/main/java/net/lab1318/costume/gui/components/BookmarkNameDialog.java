package net.lab1318.costume.gui.components;

import com.google.common.base.Optional;
import com.vaadin.event.FieldEvents.BlurEvent;
import com.vaadin.event.FieldEvents.BlurListener;
import com.vaadin.event.FieldEvents.FocusEvent;
import com.vaadin.event.FieldEvents.FocusListener;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public abstract class BookmarkNameDialog extends Window {
    public BookmarkNameDialog() {
        this(Optional.absent());
    }

    public BookmarkNameDialog(final Optional<String> suggestedName) {
        center();
        setClosable(false);
        setModal(true);
        setResizable(false);

        final BookmarkNameDialogDesign design = new BookmarkNameDialogDesign();
        design.getCancelButton().addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                BookmarkNameDialog.this.close();
            }
        });
        design.getSaveButton().addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                if (!design.getNameTextField().getValue().trim().isEmpty()) {
                    BookmarkNameDialog.this.close();
                    _save(design.getNameTextField().getValue());
                }
            }
        });
        if (suggestedName.isPresent()) {
            design.getNameTextField().setValue(suggestedName.get());
        }
        design.getNameTextField().addBlurListener(new BlurListener() {
            @Override
            public void blur(final BlurEvent event) {
                design.getCancelButton().removeClickShortcut();
                design.getSaveButton().removeClickShortcut();
            }
        });
        design.getNameTextField().addFocusListener(new FocusListener() {
            @Override
            public void focus(final FocusEvent event) {
                design.getCancelButton().setClickShortcut(KeyCode.ESCAPE);
                design.getSaveButton().setClickShortcut(KeyCode.ENTER);
            }
        });
        setContent(design);
    }

    protected abstract void _save(final String name);
}
