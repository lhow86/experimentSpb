package com.experimentspb.business.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
@Slf4j
public class TestController extends BaseController {


    @RequestMapping("/hot")
    public String get() {
        log.info("............");
        sentinelTestService.doSomeThing2(test);
        return "O w O";
    }

}
