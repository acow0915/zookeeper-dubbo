package com.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.dubbo"})
public class ConsumerApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ConsumerApp.class, args);
    }
}
