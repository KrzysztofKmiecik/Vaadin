package pl.kmiecik.vaadin.carCatalog.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kmiecik.vaadin.carCatalog.application.port.CarUseCase;
import pl.kmiecik.vaadin.carCatalog.domain.Car;
import pl.kmiecik.vaadin.carCatalog.domain.CarRepository;

import java.util.List;

@Service
public class CarService implements CarUseCase {

  private final CarRepository repository;

  @Autowired
    public CarService(CarRepository repository) {
        this.repository = repository;
    }


    @Override
    public Car addCar(Car car) {
        return repository.save(car);
    }

    @Override
    public List<Car> showCars() {
        return repository.findAll();
    }
}
