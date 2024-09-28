package ru.vagapov.spring.task_2_2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.vagapov.spring.task_2_2.model.Dog;

@Configuration
@ComponentScan(basePackages = "ru.vagapov.spring.task_2_2")
public class AppConfig {

}
