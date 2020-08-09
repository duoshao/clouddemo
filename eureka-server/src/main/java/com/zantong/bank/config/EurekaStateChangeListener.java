package com.zantong.bank.config;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @program: bank
 * @description:
 * @author: xwp
 * @create: 2020-08-08 09:54
 **/
@Component
public class EurekaStateChangeListener {
    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        System.out.println(event.getServerId() + "\t" + event.getAppName() + " 服务下线 ");
    }
    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        System.out.println(instanceInfo.getAppName() + " 进行注册 ");
    }
    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        System.out.println(event.getServerId() + "\t" + event.getAppName() + " 服务进行续约 ");
    }
    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        System.out.println(" 注册中心启动 ");
    }
    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        System.out.println("Eureka Server启动 ");
    }
}

