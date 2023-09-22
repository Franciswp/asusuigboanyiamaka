package com.asusuigbo.asusuigboanyiamaka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("com.asusuigbo.asusuigboanyiamaka.repository")
@EntityScan("com.asusuigbo.asusuigboanyiamaka.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@SpringBootApplication
public class AsusuigboanyiamakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsusuigboanyiamakaApplication.class, args);
    }

}
