package com.example.eureka_client1.controller;


import com.example.eureka_client1.service.DataServiceFeignClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DataServiceFeignController {

    @Autowired
    DataServiceFeignClientInterface dateServiceFeignClientInterface;

    @GetMapping("/date")
    public String getDate( @RequestParam String param ) {
        return dateServiceFeignClientInterface.consumer( param );
    }
    @GetMapping("/user")
    public String getUser( @RequestParam String username ) {
        return dateServiceFeignClientInterface.consumer1( username );
    }
}
