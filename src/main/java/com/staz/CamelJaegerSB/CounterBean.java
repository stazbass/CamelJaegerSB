package com.staz.CamelJaegerSB;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component("counterBean")
public class CounterBean {

    private int counter;

    public String someMethod(String body) {
        return "" + ++counter;
    }

}
