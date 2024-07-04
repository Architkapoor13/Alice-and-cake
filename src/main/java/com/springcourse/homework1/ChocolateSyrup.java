package com.springcourse.homework1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup", havingValue = "chocolate")
public class ChocolateSyrup implements Syrup{

    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}
