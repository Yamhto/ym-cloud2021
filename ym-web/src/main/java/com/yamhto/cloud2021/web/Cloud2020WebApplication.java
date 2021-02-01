package com.yamhto.cloud2021.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类描述：
 *
 * @ClassName Cloud2020WebApplication
 * @Description Web Application
 * @Author ming.yang
 * @Date 2021/2/1 2:35 下午
 * @Version 1.0
 */
@SpringBootApplication
public class Cloud2020WebApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Cloud2020WebApplication.class);
        application.run(args);
    }
}
