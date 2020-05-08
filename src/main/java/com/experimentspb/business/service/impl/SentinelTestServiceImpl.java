package com.experimentspb.business.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.experimentspb.business.service.SentinelTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SentinelTestServiceImpl extends BaseService implements SentinelTestService {

    @Override
    @SentinelResource(value = "doSomeThing2")
    public void doSomeThing2(String str) {
        log.info("str-----" + str);
        throw new RuntimeException("发生异常");
    }

    @Override
    @SentinelResource(value = "doSomeThing", blockHandler = "exceptionHandler")
    public void doSomeThing(String str) {
        log.info("str-----" + str);
    }

    // 限流与阻塞处理
    public void exceptionHandler(String str, BlockException ex) {
        log.error("exceptionHandler: " + str, ex);
    }

}
