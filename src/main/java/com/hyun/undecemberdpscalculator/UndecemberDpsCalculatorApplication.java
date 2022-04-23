package com.hyun.undecemberdpscalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.List;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class UndecemberDpsCalculatorApplication {

    public

    static void main(String[] args) {
        SpringApplication.run(UndecemberDpsCalculatorApplication.class, args);
    }

}
