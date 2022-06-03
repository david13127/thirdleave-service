package com.thirdleave.service.app.user.service;

import com.thirdleave.service.app.user.po.UserPO;
import com.thirdleave.service.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<UserPO> queryAllUser() {
        return userMapper.selectAll();
    }
}
