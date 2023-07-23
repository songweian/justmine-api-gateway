package org.justmine.gateway.bootstrap.justminebootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestJustmineBootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.from(JustmineBootstrapApplication::main).with(TestJustmineBootstrapApplication.class).run(args);
    }

}
