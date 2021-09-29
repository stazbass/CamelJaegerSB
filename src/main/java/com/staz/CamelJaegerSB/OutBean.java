package com.staz.CamelJaegerSB;

import org.springframework.stereotype.Component;

@Component("outBean")
public class OutBean {
    public void accept(String value){
        System.out.println(value);
    }
}
