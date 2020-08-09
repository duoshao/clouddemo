package com.zantong.bank.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zantong.bank.inter.IFeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: bank
 * @description:
 * @author: xwp
 * @create: 2020-08-07 18:12
 **/
@RestController
public class FeignController {

    @Autowired
    IFeignClientService iFeignClientService;

    @GetMapping("/userfign")
    public String getOrder() {
        return iFeignClientService.getOrderToMemberInfo("nihao");
    }

    @GetMapping("/userInfoNoHystrix")
    public String userInfoNoHystrix(){
        return iFeignClientService.getOrderToMemberInfo("没有使用断路器");
    }

    //使用断路器解决服务雪崩效应方法
    @HystrixCommand(fallbackMethod= "fallback")
    @GetMapping("/userInfoWithHystrix")
    public String userInfoWithHystrix(){
        return iFeignClientService.getOrderToMemberInfo("使用了断路器");
    }

    // 服务进入保护时，回调方法
    public String fallback() {
        return  "您好，进入服务降级方法";
    }
}
