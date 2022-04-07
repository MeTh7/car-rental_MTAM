package ch.juventus.carrental.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/api/v1/helloworld")
    public ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>("Hello 777World", HttpStatus.OK);
    }

}
