package pl.kmiecik.vaadin.carCatalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.kmiecik.vaadin.carCatalog.application.port.CarUseCase;
import pl.kmiecik.vaadin.carCatalog.domain.Car;

@Component
public class Init {

    private final CarUseCase service;

    @Autowired
    public Init(CarUseCase service) {
        this.service = service;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void start(){
        service.addCar(new Car("BMW","i9"));
        service.addCar(new Car("Fiat","Ducato"));
    }

}
