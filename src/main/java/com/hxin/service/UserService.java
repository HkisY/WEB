package com.hxin.service;

import com.hxin.entity.PO.UserPo;

/**
 * @author Hxin
 * @since 2018/6/6 下午10:12
 */
public interface UserService {
    /**
     * select User entity by User`s username
     * @param username username
     * @return User Entity
     */
    UserPo selectUserByUsername(String username);

    boolean insertUser(UserPo userPo);
}
