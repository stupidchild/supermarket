package com.xinba.supermarket.common;

import java.util.List;

public class Pagination<T> {

    public int total;

    public List<T> data;

    /**
     * Getter method for property <tt>total</tt>.
     *
     * @return property value of total
     */
    public int getTotal() {
        return total;
    }

    /**
     * Setter method for property <tt>total</tt>.
     *
     * @param total value to be assigned to property total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Getter method for property <tt>data</tt>.
     *
     * @return property value of data
     */
    public List<T> getData() {
        return data;
    }

    /**
     * Setter method for property <tt>data</tt>.
     *
     * @param data value to be assigned to property data
     */
    public void setData(List<T> data) {
        this.data = data;
    }
}
