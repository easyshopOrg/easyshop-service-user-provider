package com.cyc.easy.shop.service.user.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import sun.applet.Main;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.cyc.easy.shop")
@EnableHystrix
@EnableHystrixDashboard
@EnableTransactionManagement
@MapperScan(basePackages = "com.cyc.easy.shop.commons.mapper")
public class EasyshopServiceUserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyshopServiceUserProviderApplication.class,args);
        Main.main(args);
    }
}
