package com.example.eureka_client1.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient( value = "eureka-client" )
public interface DataServiceFeignClientInterface {
    @GetMapping("/test")
    String consumer( @RequestParam("param") String param );

    @GetMapping("/getUser")
    String consumer1( @RequestParam("username") String username );
}
