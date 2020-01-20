package com.fun.uncle.hello.spring.cloud.alibaba.rocketmq.provider.controller;

import com.fun.uncle.hello.spring.cloud.alibaba.rocketmq.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/20  13:43
 * @Version: 0.0.1-SNAPSHOT
 */
@RestController
public class RocketMQProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping(value = "send/{message}")
    public String send(@PathVariable String message) {
        providerService.send(message);
        return "OK";
    }
}
