package com.demo.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description: feign 配置
 **/
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevver() {
        /*
         * 日志级别
         *
         * No logging.
         * NONE, 默认，不显示任何日志
         *  Log only the request method and URL and the response status code and execution time.
         * BASIC, 仅记录请求方法、url、响应码、执行时间
         * Log the basic information along with request and response headers.
         * HEADERS, 除了BASIC 的信息还有请求和响应的头信息
         *  Log the headers, body, and metadata for both requests and responses.
         * FULL 除了HEADERS 的信息还有请求和响应的正文和元数据
         */
        return Logger.Level.FULL;
    }
}
