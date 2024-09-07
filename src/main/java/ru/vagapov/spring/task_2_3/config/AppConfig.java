package ru.vagapov.spring.task_2_3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.vagapov.spring.task_2_3.model.Island2;
import ru.vagapov.spring.task_2_3.model.Wood3;

@Configuration
@ComponentScan(basePackages = "ru.vagapov.spring.task_2_3")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
}
