package com.xinba.supermarket.controller.request;

import com.xinba.supermarket.entity.User;

import java.util.Date;

public class UserRequestParam extends PageRequest{

    private User user;

    private Date createTimeBegin;

    private Date createTimeEnd;


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


    /**
     * Getter method for property <tt>createTimeBegin</tt>.
     *
     * @return property value of createTimeBegin
     */
    public Date getCreateTimeBegin() {
        return createTimeBegin;
    }

    /**
     * Setter method for property <tt>createTimeBegin</tt>.
     *
     * @param createTimeBegin value to be assigned to property createTimeBegin
     */
    public void setCreateTimeBegin(Date createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
    }

    /**
     * Getter method for property <tt>createTimeEnd</tt>.
     *
     * @return property value of createTimeEnd
     */
    public Date getCreateTimeEnd() {
        return createTimeEnd;
    }

    /**
     * Setter method for property <tt>createTimeEnd</tt>.
     *
     * @param createTimeEnd value to be assigned to property createTimeEnd
     */
    public void setCreateTimeEnd(Date createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }
}
