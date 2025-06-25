package com.fkadu.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
    @Bean
    @Qualifier("bean1")
    public MyFirstClass myFirstBean(){
        return new MyFirstClass("first Beean");
    }

    @Bean
//    @Primary
    @Qualifier("bean2")
    public MyFirstClass mySeconfBean(){
        return new MyFirstClass("Second Beean");
    }
}
