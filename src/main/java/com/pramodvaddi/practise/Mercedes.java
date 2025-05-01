package com.pramodvaddi.practise;

import org.springframework.stereotype.Component;

@Component
public class Mercedes implements Car{
    @Override
    public String bodyType() {
        return "Sedan";
    }

    @Override
    public int makeingCost() {
        return 100_000;
    }
}
