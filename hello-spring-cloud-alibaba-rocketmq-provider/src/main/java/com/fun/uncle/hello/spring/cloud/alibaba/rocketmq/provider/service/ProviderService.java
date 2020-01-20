package com.fun.uncle.hello.spring.cloud.alibaba.rocketmq.provider.service;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/20  13:41
 * @Version: 0.0.1-SNAPSHOT
 */
public interface ProviderService {

    /**
     * 发送信息
     *
     * @param message
     */
    void send(String message);
}
