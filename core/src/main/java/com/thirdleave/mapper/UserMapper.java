package com.thirdleave.mapper;


import com.thirdleave.po.UserPO;

import java.util.List;

public interface UserMapper {

    void insert(UserPO userPO);

    List<UserPO> selectAll();
}
