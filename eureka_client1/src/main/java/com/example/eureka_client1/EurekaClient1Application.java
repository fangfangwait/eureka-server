package com.example.eureka_client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClient1Application {


    @Bean
    //实现负载均衡的注解
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
        public static void main(String[] args) {
        SpringApplication.run(EurekaClient1Application.class, args);
    }

}
