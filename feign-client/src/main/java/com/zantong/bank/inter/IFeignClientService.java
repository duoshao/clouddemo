package com.zantong.bank.inter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: bank
 * @description:
 * @author: xwp
 * @create: 2020-08-07 18:08
 **/
@FeignClient(name = "api-user",fallback = FeignClientServiceImpl.class)
@Component
public interface IFeignClientService {

    @RequestMapping("/user/userName")
    public String getOrderToMemberInfo(@RequestParam("userName") String userName);
}
