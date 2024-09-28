package ru.vagapov.spring.task_2_2.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component ("dogBean")
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Я лучший в джаве!!!";
    }
}
