package com.yamhto.cloud2021.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 *
 * @ClassName InvokeServiceController
 * @Description TODO
 * @Author ming.yang
 * @Date 2021/2/1 3:38 下午
 * @Version 1.0
 */
@RestController
public class InvokeServiceController {

    @Autowired
    private InvokeWebService invokeWebService;

    @RequestMapping(value = "invoke")
    public String invoke() {
        return invokeWebService.invoke();
    }
}
