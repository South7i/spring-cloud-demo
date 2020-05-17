package com.demo.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description: hystrix 仪表盘 启动
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class DashboardMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(DashboardMain9001.class, args);
        System.out.println("DashboardMain9001 start ok");
    }
}
