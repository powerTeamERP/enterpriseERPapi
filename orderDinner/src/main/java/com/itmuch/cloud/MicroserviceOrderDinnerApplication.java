package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceOrderDinnerApplication {

  public static void main(String[] args) {
    SpringApplication.run(MicroserviceOrderDinnerApplication.class, args);
  }
}
