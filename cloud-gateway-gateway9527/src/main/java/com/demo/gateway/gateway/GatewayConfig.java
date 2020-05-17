package com.demo.gateway.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description: gateway 路由配置
 **/
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator taobaoRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        RouteLocator build = routes.route("taobao_route",
                r -> r.path("/taobao").uri("https://www.taobao.com/")).build();
        return build;
    }

    @Bean
    public RouteLocator newsBaiduRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        RouteLocator build = routes.route("news_baidu_route",
                r -> r.path("/guoji").uri("http://news.baidu.com/")).build();
        return build;
    }

}
