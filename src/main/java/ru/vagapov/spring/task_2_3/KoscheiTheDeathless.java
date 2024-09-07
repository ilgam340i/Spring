package ru.vagapov.spring.task_2_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.vagapov.spring.task_2_3.model.Ocean1;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }
}
