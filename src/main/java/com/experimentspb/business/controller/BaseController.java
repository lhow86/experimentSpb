package com.experimentspb.business.controller;

import com.experimentspb.business.service.SentinelTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Slf4j
public abstract class BaseController {

    @Value("${aliyun.test}")
    public String test;

    @Autowired
    public SentinelTestService sentinelTestService;

}
