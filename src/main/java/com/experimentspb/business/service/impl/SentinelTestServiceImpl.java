package com.experimentspb.business.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.experimentspb.business.service.SentinelTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SentinelTestServiceImpl extends BaseService implements SentinelTestService {


    @Override
    @SentinelResource(value = "doSomeThing")
    public void doSomeThing(String str) {
        log.info("str-----" + str);
    }

}
