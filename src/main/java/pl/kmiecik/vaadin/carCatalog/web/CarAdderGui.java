package pl.kmiecik.vaadin.carCatalog.web;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.kmiecik.vaadin.carCatalog.application.port.CarUseCase;
import pl.kmiecik.vaadin.carCatalog.domain.Car;

@Route("add-car")
@Controller
public class CarAdderGui extends VerticalLayout {

    private final CarUseCase service;

    @Autowired
    public CarAdderGui(CarUseCase service) {
        this.service = service;

        TextField textFieldMark = new TextField();
        textFieldMark.setPlaceholder("Mark");
        add(textFieldMark);

        TextField textFieldModel = new TextField();
        textFieldModel.setPlaceholder("Model");
        add(textFieldModel);

        Button buttonAddCar = new Button("AddCar", new Icon(VaadinIcon.CAR));
        buttonAddCar.addClickListener(event -> {
            service.addCar(new Car(textFieldMark.getValue(), textFieldModel.getValue()));
            service.showCars().forEach(System.out::println);
        });
        add(buttonAddCar);

    }

}
