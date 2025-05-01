package com.pramodvaddi.practise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {


    private Car theCar;

    @Autowired
    public Controller(Car newCar){
        this.theCar = newCar;

    }

    @GetMapping("/body")
    public String type(){
        return theCar.bodyType();
    }

    @GetMapping("/price")
    public int price(){
        return theCar.makeingCost();
    }

}