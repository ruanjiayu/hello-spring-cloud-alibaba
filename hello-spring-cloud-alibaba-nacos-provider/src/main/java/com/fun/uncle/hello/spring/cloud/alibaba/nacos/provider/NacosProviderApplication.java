package com.fun.uncle.hello.spring.cloud.alibaba.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/16  17:19
 * @Version: 0.0.1-SNAPSHOT
 */
@EnableDiscoveryClient /*能被nacos注册和发现*/
@SpringBootApplication
public class NacosProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplication.class, args);
    }

}
