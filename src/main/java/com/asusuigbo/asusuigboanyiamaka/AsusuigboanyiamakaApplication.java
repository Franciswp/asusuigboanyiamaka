package com.asusuigbo.asusuigboanyiamaka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class AsusuigboanyiamakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsusuigboanyiamakaApplication.class, args);
    }

}
