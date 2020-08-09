package com.zantong.bank.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: bank
 * @description:
 * @author: xwp
 * @create: 2020-08-07 16:58
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/info")
    String getUserInfo(){
        return "你好"+port;
    }

    @GetMapping(value = "/userName")
    String getOrderInfo(@RequestParam String userName){
        return "获得端口号"+userName+port;
    }

}
