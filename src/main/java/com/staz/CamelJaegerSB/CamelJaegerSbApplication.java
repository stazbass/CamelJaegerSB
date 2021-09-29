package com.staz.CamelJaegerSB;

import org.apache.camel.opentracing.starter.CamelOpenTracing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@CamelOpenTracing
public class CamelJaegerSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelJaegerSbApplication.class, args);
	}

}
