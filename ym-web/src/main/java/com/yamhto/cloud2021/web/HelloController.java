package com.yamhto.cloud2021.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述：
 *
 * @ClassName HelloController
 * @Description TODO
 * @Author ming.yang
 * @Date 2021/2/1 3:31 下午
 * @Version 1.0
 */
@RestController
public class HelloController {

    @GetMapping(value = "hello")
    public String hello() {
        return "HELLO SPRING";
    }

    @GetMapping(value = "number")
    public Integer number() {
        return 1;
    }

    @PostMapping(value = "object")
    public List<String> object() {
        List<String> list = new ArrayList<>();
        list.add("yamhto");
        return list;
    }
}
