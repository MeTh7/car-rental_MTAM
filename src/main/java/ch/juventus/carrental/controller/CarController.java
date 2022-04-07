package ch.juventus.carrental.controller;


import ch.juventus.carrental.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/api/v1/helloworld")
    public ResponseEntity<String> helloWorld(){
        String greeting = carService.getGreeting();
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }

}
