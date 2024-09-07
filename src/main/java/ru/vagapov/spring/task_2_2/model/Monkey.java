package ru.vagapov.spring.task_2_2.model;

import org.springframework.stereotype.Component;

@Component
public class Monkey extends Animal {
    @Override
    public String toString() {
        return "Learn Java! Learn JDBC! Learn Hibernate! Learn Spring!";
    }
}

