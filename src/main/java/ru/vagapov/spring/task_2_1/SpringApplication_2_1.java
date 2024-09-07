package ru.vagapov.spring.task_2_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.vagapov.spring.task_2_1.config.AppConfig;
import ru.vagapov.spring.task_2_1.model.HelloSpring;

public class SpringApplication_2_1 {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloSpring bean =
                (HelloSpring) applicationContext.getBean("helloSpring");
        System.out.println(bean.getMessage());
    }

}
