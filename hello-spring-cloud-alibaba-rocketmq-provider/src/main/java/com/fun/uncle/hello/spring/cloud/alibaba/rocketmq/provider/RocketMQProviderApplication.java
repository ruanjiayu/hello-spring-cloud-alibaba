package com.fun.uncle.hello.spring.cloud.alibaba.rocketmq.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/20  13:31
 * @Version: 0.0.1-SNAPSHOT
 */

@SpringBootApplication
@EnableBinding({Source.class})
public class RocketMQProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocketMQProviderApplication.class, args);
    }
}
