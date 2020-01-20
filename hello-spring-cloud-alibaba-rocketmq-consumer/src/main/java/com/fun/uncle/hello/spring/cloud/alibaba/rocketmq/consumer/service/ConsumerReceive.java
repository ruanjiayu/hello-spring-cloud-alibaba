package com.fun.uncle.hello.spring.cloud.alibaba.rocketmq.consumer.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/20  14:27
 * @Version: 0.0.1-SNAPSHOT
 */
@Service
public class ConsumerReceive {

    @StreamListener("input")
    public void receiveInput(String message) {
        System.out.println("【receive】:" + message);
    }
}
