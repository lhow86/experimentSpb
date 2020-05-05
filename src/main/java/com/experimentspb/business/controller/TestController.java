package com.experimentspb.business.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class TestController {

    private static Log log = LogFactory.getLog(TestController.class);

    @Value("${settings.test}")
    public String test;

    @RequestMapping("/hot")
//    @SentinelResource(value = "hot")
    public String get() {
        return "success";
    }

}
