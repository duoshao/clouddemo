package com.zantong.bank.config;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * @program: bank
 * @description:
 * @author: xwp
 * @create: 2020-08-08 09:49
 **/
@Component
public class CustomHealth extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
//        builder.down().withDetail("status",false);
    }
}
