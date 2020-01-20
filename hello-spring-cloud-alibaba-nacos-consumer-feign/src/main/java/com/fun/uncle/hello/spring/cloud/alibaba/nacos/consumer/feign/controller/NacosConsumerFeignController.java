package com.fun.uncle.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.fun.uncle.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/17  9:38
 * @Version: 0.0.1-SNAPSHOT
 */

@RestController
public class NacosConsumerFeignController {

    @Autowired
    private NacosProviderService nacosProviderService;

    @GetMapping(value = "/echo/hi")
    public String echo() {
       return nacosProviderService.echo("hi");
    }
}
