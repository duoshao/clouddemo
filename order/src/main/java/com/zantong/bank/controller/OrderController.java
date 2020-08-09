package com.zantong.bank.controller;

import com.netflix.ribbon.RequestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: bank
 * @description:
 * @author: xwp
 * @create: 2020-08-07 17:23
 **/
@RestController
@RequestMapping
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getOrderToUser")
    String getOrderToUser(){
        String url = "http://api-user/user/info";
        String result = restTemplate.getForObject(url,String.class);
        return result;
    }


}
