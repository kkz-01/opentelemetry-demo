package com.kkz;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @Resource
    private TestConfig config;

    @GetMapping("/test")
    public boolean test() {
        boolean flag = config.getFlag();
        System.out.println();
        return flag;
    }
}
