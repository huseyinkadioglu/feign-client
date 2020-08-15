package guru.spring.feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignClientApplication {
/*
    In this app, i am actually trying to manipulate the data from external service. I will create a Feign client and connect their API using only url.
    Let's see how it goes.This is my first time trying.
 */
    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class, args);
    }

}
