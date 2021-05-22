package pl.kmiecik.vaadin.carCatalog.infrastructure;

import org.springframework.stereotype.Repository;
import pl.kmiecik.vaadin.carCatalog.domain.Car;
import pl.kmiecik.vaadin.carCatalog.domain.CarRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryCarREpository implements CarRepository {

    List<Car> storage = new ArrayList<>();

    @Override
    public List<Car> findAll() {
        return storage;
    }

    @Override
    public Car save(Car car) {
        storage.add(car);
        return car;
    }
}
