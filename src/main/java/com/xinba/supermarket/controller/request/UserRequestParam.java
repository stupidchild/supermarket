package com.xinba.supermarket.controller.request;

import com.xinba.supermarket.entity.User;

public class UserRequestParam extends PageRequest{

    private User user;


    /**
     * Getter method for property <tt>user</tt>.
     *
     * @return property value of user
     */
    public User getUser() {
        return user;
    }

    /**
     * Setter method for property <tt>user</tt>.
     *
     * @param user value to be assigned to property user
     */
    public void setUser(User user) {
        this.user = user;
    }
}
