package com.zantong.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: bank
 * @description:
 * @author: xwp
 * @create: 2020-08-07 18:06
 **/
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
