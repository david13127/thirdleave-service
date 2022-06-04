package com.thirdleave.service;

import com.thirdleave.po.UserPO;
import com.thirdleave.mapper.UserMapper;
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
