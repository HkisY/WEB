package com.hxin.business.Imlp;

import com.hxin.business.UserBusiness;
import com.hxin.entity.BO.UserBo;
import com.hxin.entity.PO.UserPo;
import com.hxin.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Hxin
 * @version 1.0
 * @since 2018/6/15 下午5:02
 */
@Component
public class UserBusinessImpl implements UserBusiness{
    @Resource
    private UserService userService;
    @Override
    public UserBo userLogin(String username) {
        UserPo userPo = userService.selectUserByUsername(username);
        UserBo userBo = new UserBo();
        //todo:this code is so boring and if anyone who can write a code which implements beans,i will be grateful
        userBo.setNickname(userPo.getNickname());
        userBo.setUsername(userPo.getUsername());
        userBo.setPassword(userPo.getPassword());
        return userBo;
    }

    @Override
    public boolean userRegister(UserBo userBo) {
        UserPo userPo = new UserPo();
        userPo.setNickname(userBo.getNickname());
        userPo.setUsername(userBo.getUsername());
        userPo.setPassword(userBo.getPassword());
        return userService.insertUser(userPo);
    }
}
