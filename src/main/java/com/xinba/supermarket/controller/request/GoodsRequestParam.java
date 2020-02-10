package com.xinba.supermarket.controller.request;

import com.xinba.supermarket.entity.Goods;

import java.util.Date;

public class GoodsRequestParam extends PageRequest {

    private Goods goods;

    private Date addTimeBegin;

    private Date addTimeEnd;

    /**
     * Getter method for property <tt>goods</tt>.
     *
     * @return property value of goods
     */
    public Goods getGoods() {
        return goods;
    }

    /**
     * Setter method for property <tt>goods</tt>.
     *
     * @param goods value to be assigned to property goods
     */
    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    /**
     * Getter method for property <tt>addTimeBegin</tt>.
     *
     * @return property value of addTimeBegin
     */
    public Date getAddTimeBegin() {
        return addTimeBegin;
    }

    /**
     * Setter method for property <tt>addTimeBegin</tt>.
     *
     * @param addTimeBegin value to be assigned to property addTimeBegin
     */
    public void setAddTimeBegin(Date addTimeBegin) {
        this.addTimeBegin = addTimeBegin;
    }

    /**
     * Getter method for property <tt>addTimeEnd</tt>.
     *
     * @return property value of addTimeEnd
     */
    public Date getAddTimeEnd() {
        return addTimeEnd;
    }

    /**
     * Setter method for property <tt>addTimeEnd</tt>.
     *
     * @param addTimeEnd value to be assigned to property addTimeEnd
     */
    public void setAddTimeEnd(Date addTimeEnd) {
        this.addTimeEnd = addTimeEnd;
    }
}
