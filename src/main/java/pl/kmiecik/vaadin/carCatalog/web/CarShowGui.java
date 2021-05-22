package pl.kmiecik.vaadin.carCatalog.web;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.kmiecik.vaadin.carCatalog.application.port.CarUseCase;
import pl.kmiecik.vaadin.carCatalog.domain.Car;

@Route("show-cars")
@Controller
public class CarShowGui extends VerticalLayout {

    private final CarUseCase service;

    @Autowired
    public CarShowGui(CarUseCase service) {
        this.service = service;

        Grid<Car> grid = new Grid<>(Car.class);
        add(grid);

        Button buttonShowAllCar = new Button("showAllCars", new Icon(VaadinIcon.CAR));
        buttonShowAllCar.addClickListener(event -> {
            grid.setItems(service.showCars());
        });

        add(buttonShowAllCar);

    }

}
