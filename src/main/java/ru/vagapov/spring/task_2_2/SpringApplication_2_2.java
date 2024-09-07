package ru.vagapov.spring.task_2_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.vagapov.spring.task_2_2.config.AppConfig;
import ru.vagapov.spring.task_2_2.model.AnimalsCage;

public class SpringApplication_2_2 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 5; i++) {
            AnimalsCage bean = applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();
        }
    }


}
