package pl.kmiecik.vaadin.carCatalog.application.port;

import pl.kmiecik.vaadin.carCatalog.domain.Car;

import java.util.List;

public interface CarUseCase {

    Car addCar(Car car);

    List<Car> showCars();
}
