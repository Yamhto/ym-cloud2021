package com.yamhto.cloud2021.test;

import com.yamhto.cloud.rest.template.RestTemplateHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


/**
 * 类描述：
 *
 * @ClassName InvokeWebService
 * @Description InvokeWebService
 * @Author ming.yang
 * @Date 2021/2/1 3:29 下午
 * @Version 1.0
 */
@Service
public class InvokeWebService {

    private static final String URL = "http://127.0.0.1:8084/hello";

    @Autowired
    private RestTemplateHelper<Object, String> restTemplateHelper;

    public String invoke() {
        ResponseEntity<String> invoke = restTemplateHelper.invoke(URL, HttpMethod.GET, null);
        String body = invoke.getBody();
        System.out.println(body);
        return body;
    }
}
