package com.springcourse.homework1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frosting", havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{


    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
