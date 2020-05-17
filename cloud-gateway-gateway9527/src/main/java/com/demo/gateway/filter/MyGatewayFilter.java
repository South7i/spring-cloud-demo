package com.demo.gateway.filter;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description: 自定义过滤器
 **/
@Component
@Slf4j
public class MyGatewayFilter implements GlobalFilter, Ordered {


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("***** my filter start");
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        log.info(uname);
        if (StrUtil.isBlank(uname)){
            log.info(" ***** uname is null");
            //设置 状态码
            exchange.getResponse().setStatusCode(HttpStatus.NOT_FOUND);
            return exchange.getResponse().setComplete();
        }
        //继续过滤
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        // 权重 ，优先级
        return 0;
    }
}
