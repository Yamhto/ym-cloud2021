//package com.yamhto.cloud2021.web;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.web.reactive.function.server.RequestPredicates;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.RouterFunctions;
//import org.springframework.web.reactive.function.server.ServerResponse;
//
///**
// * 类描述：
// *
// * @ClassName HelloWorldRounter
// * @Description HelloWorldRouter
// * @Author ming.yang
// * @Date 2021/2/1 2:56 下午
// * @Version 1.0
// */
//@Configuration
//public class HelloWorldRouter {
//
//    @Bean
//    public RouterFunction<ServerResponse> route(HelloWorldHandler helloWorldHandler) {
//        return RouterFunctions.route(RequestPredicates.GET("/hello").
//                and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), helloWorldHandler::hello);
//    }
//
//}
