package com.pramodvaddiraju.quizapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class Controller {

    @Autowired
    private Mercedes C250;

    public Controller(Mercedes car){
        this.C250 = car;

    }
    @GetMapping("/body")
    public String bodyType(){
        return C250.bodyType();
    }

    @GetMapping("/making")
    public int cost(){
        return C250.makeingCost();
    }
}
