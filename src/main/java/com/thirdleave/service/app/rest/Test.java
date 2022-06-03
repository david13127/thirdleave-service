package com.thirdleave.service.app.rest;

import com.thirdleave.service.app.user.po.UserPO;
import com.thirdleave.service.app.user.service.UserService;
import com.thirdleave.service.app.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/test")
public class Test {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        RedisUtils.set("name", "thirdleave");
        RedisUtils.get("name");
        List<UserPO> userPOS = userService.queryAllUser();
        return userPOS.get(0).getName();
    }
}
