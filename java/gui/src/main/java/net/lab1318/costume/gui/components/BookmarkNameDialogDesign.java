package net.lab1318.costume.gui.components;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

@SuppressWarnings("serial")
@DesignRoot
final class BookmarkNameDialogDesign extends VerticalLayout {
    public BookmarkNameDialogDesign() {
        Design.read(this);
        nameTextField.focus();
    }

    public Button getCancelButton() {
        return cancelButton;
    }

    public TextField getNameTextField() {
        return nameTextField;
    }

    public Button getSaveButton() {
        return saveButton;
    }

    Button cancelButton = null;
    Button saveButton = null;
    TextField nameTextField = null;
}
