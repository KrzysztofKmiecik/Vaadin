package pl.kmiecik.vaadin;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("hello")
public class VaadinGui extends HorizontalLayout {
    TextField placeholderField;
    Dialog dialog;

    public VaadinGui() {
        placeholderField = new TextField();
        placeholderField.setPlaceholder("Placeholder");

        add(placeholderField);

        dialog = new Dialog();


        dialog.setWidth("400px");
        dialog.setHeight("150px");
        Button button = new Button("Vaadin button", new Icon(VaadinIcon.HANDSHAKE));

        button.addClickListener(event -> dialog.open());


        button.addClickListener(buttonClickEvent -> {
            System.out.println(placeholderField.getValue());
            dialog.add(new Text(placeholderField.getValue()));
            dialog.open();
        });
        add(button);


    }

    private void showButtonClickedMessage(ClickEvent<Button> buttonClickEvent) {

        System.out.println(placeholderField.getValue());
        dialog.add(new Text(placeholderField.getValue()));
        dialog.open();
    }


}
