/*
 * @(#)UserDaoImpl.java 2013-4-10 ����01:35:11 Order
 */
package com.erp.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.erp.dao.UserDao;
import com.erp.model.User;
import com.erp.model.UserType;

/**
 * UserDaoImpl
 * @author wang
 * @version 1.0
 *
 */
@Component("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

    @Override
    public User login(User user) {
        String hql = "from User u where u.name = ? and u.password = ?";
        Object[] param = new Object[] { user.getName(), user.getPassword() };
        return this.find(User.class, hql, param);
    }

    @Override
    public List<User> list(UserType type) {
        String hql = "from User u where u.type = ?";
        Object[] param = new Object[] { type };
        return this.list(User.class, hql, param);
    }

}
