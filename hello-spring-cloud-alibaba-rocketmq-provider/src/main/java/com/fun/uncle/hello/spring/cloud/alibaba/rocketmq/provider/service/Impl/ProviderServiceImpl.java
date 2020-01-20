package com.fun.uncle.hello.spring.cloud.alibaba.rocketmq.provider.service.Impl;

import com.fun.uncle.hello.spring.cloud.alibaba.rocketmq.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/20  13:38
 * @Version: 0.0.1-SNAPSHOT
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private MessageChannel output;

    @Override
    public void send(String message) {
        output.send(MessageBuilder.withPayload(message).build());
    }
}
