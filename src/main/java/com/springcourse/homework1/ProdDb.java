package com.springcourse.homework1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

@ConditionalOnProperty(name = "project.env", havingValue = "prod")
public class ProdDb implements DB {

    public String getData(){
        return "ProdDb Data";
    }
}
