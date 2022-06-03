package com.thirdleave.service.mapper;

import com.thirdleave.service.app.user.po.UserPO;

import java.util.List;

public interface UserMapper {

    void insert(UserPO userPO);

    List<UserPO> selectAll();
}
