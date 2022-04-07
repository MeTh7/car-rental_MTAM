package ch.juventus.carrental.service;

import ch.juventus.carrental.persistance.CarDatabase;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    private final CarDatabase carDatabase;

    public CarService(CarDatabase carDatabase) {
        this.carDatabase = carDatabase;
    }


    public String getGreeting() {
        // implement business logic
        return carDatabase.loadGreeting();
    }
}
