package com.hxin.dao;

import com.hxin.entity.PO.UserPo;

/**
 * @author Hxin
 * @since 2018/6/3 下午1:39
 */
public interface UserMapper {

    UserPo selectUserByUsername(String username);

    boolean insertUser(UserPo userPo);
}
