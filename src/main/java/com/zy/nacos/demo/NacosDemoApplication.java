package com.zy.nacos.demo;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用 @NacosPropertySource 加载 dataId 为 example 的配置源，并开启自动更新
 * @author gc
 */
@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class NacosDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDemoApplication.class, args);
    }

}
