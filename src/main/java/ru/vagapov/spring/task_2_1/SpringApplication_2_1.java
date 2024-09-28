package ru.vagapov.spring.task_2_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.vagapov.spring.task_2_1.config.AppConfig;
import ru.vagapov.spring.task_2_1.model.Cat;
import ru.vagapov.spring.task_2_1.model.HelloSpring;

public class SpringApplication_2_1 {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloSpring bean =
                (HelloSpring) applicationContext.getBean("helloSpring");
        System.out.println(bean.getMessage());
        HelloSpring bean1 =
                (HelloSpring) applicationContext.getBean("helloSpring");
        System.out.println(bean1.getMessage());
        System.out.println(bean==bean1);
        Cat bean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean2.getMessage());
        Cat bean3 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getMessage());
        System.out.println(bean2==bean3);
    }

}
