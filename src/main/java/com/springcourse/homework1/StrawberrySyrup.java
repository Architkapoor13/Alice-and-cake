package com.springcourse.homework1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup", havingValue = "strawberry")
public class StrawberrySyrup implements Syrup{

    public String getSyrupType(){
        return "Strawberry Syrup";
    }
}
