package com.hxin.service.Impl;

import com.hxin.dao.UserMapper;
import com.hxin.entity.PO.UserPo;
import com.hxin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Hxin
 * @describe
 * @since 2018/6/6 下午10:13
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public UserPo selectUserByUsername(String username) {
        return userMapper.selectUserByUsername(username);
    }

    @Override
    public boolean insertUser(UserPo userPo) {
        return userMapper.insertUser(userPo);

    }
}
