package com.geekerit.springbootdubboconsumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringbootDobboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDobboConsumerApplication.class, args);
    }
}
