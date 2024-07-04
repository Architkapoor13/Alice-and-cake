package com.springcourse.homework1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

public class Apple {

    void eatApple(){
        System.out.println("eating the apple");
    }

    @PostConstruct
    void appleBeforeConsctruct(){
        System.out.println("before constructing");
    }

    @PreDestroy
    void destroyApple(){
        System.out.println("destryed apple");
    }
}
