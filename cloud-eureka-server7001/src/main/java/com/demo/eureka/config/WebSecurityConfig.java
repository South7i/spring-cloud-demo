package com.demo.eureka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author: Mr.裴
 * @create 2020/5/15
 * @Description:
 **/
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        // Spring Security启用csrf防护后，会对post、delete、put等请求进行安全校验。
        // 过程是，请求里必须携带crfs的tocken，如果请求里不带有tocken时，服务器会认为该请求非法，请求就会被拒绝。
        // 默认开启，关闭csrf过滤
        http.csrf().disable();
        // 开启认证
        http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
    }
}
