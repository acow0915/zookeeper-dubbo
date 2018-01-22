package com.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dubbo"})
public class ProviderApp {
	public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
    }
}
