package com.cc.usermanage.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cc.inteface.service.UserService;
import com.cc.bean.domain.UserAddress;
import com.cc.bean.domain.UserInfo;
import com.cc.usermanage.user.mapper.UserAddressMapper;
import com.cc.usermanage.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // 调用mapper
        // select * from userAddress where userId=?
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return    userAddressMapper.select(userAddress);
    }
}
