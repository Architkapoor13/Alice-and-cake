package com.springcourse.homework1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty(name = "project.env", havingValue = "dev")
public class DevDb implements DB{

    public String getData(){
        return "Dev Data";
    }
}
