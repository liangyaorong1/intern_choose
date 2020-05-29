package com.lcvc.intern_choose.service;

import com.lcvc.intern_choose.model.Admin;

public interface AdminService {


    Admin get(Integer id);

    /**
     * 登录方法
     *
     * @param username 账户名，不能为空
     * @param password 密码，不能为空
     * @return null表示登录失败
     */
    boolean login(String username, String password);

    Admin getByUsername(String username);
}
