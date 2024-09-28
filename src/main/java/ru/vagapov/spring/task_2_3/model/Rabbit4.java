package ru.vagapov.spring.task_2_3.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

   private final Duck5 duck;
    @Autowired
    public Rabbit4(Duck5 duck) {this.duck = duck;}

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }
}
