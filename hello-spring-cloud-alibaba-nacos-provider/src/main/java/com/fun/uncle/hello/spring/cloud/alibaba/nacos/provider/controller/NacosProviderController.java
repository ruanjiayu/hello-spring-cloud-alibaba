package com.fun.uncle.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/16  17:26
 * @Version: 0.0.1-SNAPSHOT
 */
@RestController
@RefreshScope /*实现动态刷新属性值*/
public class NacosProviderController {


    @Value(value = "${server.port}")
    private String port;

    @Value(value = "${user.name}")
    private String name;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable String message) {
        return "Hello Nacos Discovery " + message + "I am from " + port;
    }


    @GetMapping(value = "hi")
    public String sayHi() {
        return "hello " + name;
    }
}
