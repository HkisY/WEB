package com.hxin.business;

import com.hxin.entity.BO.UserBo;

/**
 * @author Hxin
 * @since 2018/6/15 下午4:52
 */
public interface UserBusiness {
    /**
     * user sign in model
     * @param username username
     * @return User information
     */
    UserBo userLogin(String username);

    /**
     * user register
     * @param userBo userBo
     * @return boolean (is this operate success)
     */
    boolean userRegister(UserBo userBo);
}
