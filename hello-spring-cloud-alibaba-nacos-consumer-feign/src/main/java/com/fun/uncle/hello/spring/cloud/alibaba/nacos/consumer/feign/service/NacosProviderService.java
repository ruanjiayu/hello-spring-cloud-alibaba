package com.fun.uncle.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import com.fun.uncle.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback.NacosProviderServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/17  9:15
 * @Version: 0.0.1-SNAPSHOT
 */
@FeignClient(value = "nacos-provider", fallback = NacosProviderServiceFallback.class)
public interface NacosProviderService {

    /**
     * 请求服务提供者模块
     *
     * @param message
     * @return
     */
    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable String message);
}
