package com.fun.uncle.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import com.fun.uncle.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/17  13:47
 * @Version: 0.0.1-SNAPSHOT
 */
@Component
public class NacosProviderServiceFallback implements NacosProviderService {

    @Override
    public String echo(String message) {
        return "【网络出现问题,请刷新页面】";
    }
}
