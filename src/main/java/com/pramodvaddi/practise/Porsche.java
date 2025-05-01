package com.pramodvaddi.practise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Porsche implements Car{
    @Override
    public String bodyType() {
        return "SUV";
    }

    @Override
    public int makeingCost() {
        return 945_00;
    }
}
