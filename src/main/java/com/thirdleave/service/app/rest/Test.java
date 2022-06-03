package com.thirdleave.service.app.rest;

import com.thirdleave.service.app.utils.RedisUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/test")
public class Test {
    @GetMapping("/hello")
    public String hello() {
        RedisUtils.set("name", "thirdleave");
        return RedisUtils.get("name");
    }
}
