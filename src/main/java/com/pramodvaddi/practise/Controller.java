package com.pramodvaddi.practise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private Mercedes c250;

    public Controller(Mercedes model){
        this.c250 = model;

    }

    @GetMapping("/body")
    public String type(){
        return c250.bodyType();
    }

    @GetMapping("/price")
    public int price(){
        return c250.makeingCost();
    }

}