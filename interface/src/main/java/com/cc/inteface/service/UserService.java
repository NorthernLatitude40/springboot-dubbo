package com.cc.inteface.service;

import com.cc.bean.domain.UserAddress;
import com.cc.bean.domain.UserInfo;

import java.util.List;

public interface UserService {
    /**
     * 查询所有数据
     * @return
     */
    List<UserInfo> findAll();

    /**
     * 根据userId 查询用户地址列表
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);

}
