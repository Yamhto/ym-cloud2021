//package com.yamhto.cloud2021.web;
//
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.BodyInserters;
//import org.springframework.web.reactive.function.server.ServerRequest;
//import org.springframework.web.reactive.function.server.ServerResponse;
//import reactor.core.publisher.Mono;
//
///**
// * 类描述：
// *
// * @ClassName HelloWorldHandler
// * @Description HelloWorldHandler
// * @Author ming.yang
// * @Date 2021/2/1 2:50 下午
// * @Version 1.0
// */
//@Component
//public class HelloWorldHandler {
//
//    public Mono<ServerResponse> hello(ServerRequest request) {
//        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
//                .body(BodyInserters.fromValue("Hello, Spring!"));
//    }
//
//}
