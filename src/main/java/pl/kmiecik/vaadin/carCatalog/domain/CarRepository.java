package pl.kmiecik.vaadin.carCatalog.domain;

import java.util.List;

public interface CarRepository {
    List<Car> findAll();

    Car save(Car car);
}
