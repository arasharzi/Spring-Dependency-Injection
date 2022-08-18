package com.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config
{
    @Bean
    public Address getAddress()
    {
        return new Address("Atlanta", "GA", "USA", "30327");
    }

    @Bean
    public Phone getPhone()
    {
        return new Phone("123-456-7890");
    }

    @Bean
    public Student getStudent()
    {
        return new Student(1, "Random Name");
    }
}
