package com.example.eureka_client1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("test")
public class HelloGirlController {
    //注入刚才交由spring托管的bean
    @Autowired
    RestTemplate restTemplate;
    //是Spring用于同步client端的核心类，简化了与http服务的通信，并满足RestFul原则，程序代码可以给它提供URL，
    // 并提取结果。默认情况下，RestTemplate默认依赖jdk的HTTP连接工具。
    // 当然你也可以 通过setRequestFactory属性切换到不同的HTTP源，比如Apache HttpComponents、Netty和OkHttp。

    @GetMapping("sendStr")
    public String sendStr(String str) {
        Map map = new HashMap();
        map.put("str", str);

        //这里的url不用直接写成ip，使用服务名称代替即可
        return restTemplate.getForEntity("http://eureka-client/test/getSendStr?str="+str, String.class).getBody();
    }


}
