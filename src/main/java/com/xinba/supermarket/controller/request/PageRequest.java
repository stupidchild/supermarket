package com.xinba.supermarket.controller.request;

public class PageRequest {
    private int num;

    private int size;

    private int begin;

    /**
     * Getter method for property <tt>num</tt>.
     *
     * @return property value of num
     */
    public int getNum() {
        return num;
    }

    /**
     * Setter method for property <tt>num</tt>.
     *
     * @param num value to be assigned to property num
     */
    public void setNum(int num) {
        this.begin = (num - 1) * size;
        this.num = num;
    }

    /**
     * Getter method for property <tt>size</tt>.
     *
     * @return property value of size
     */
    public int getSize() {
        return size;
    }

    /**
     * Setter method for property <tt>size</tt>.
     *
     * @param size value to be assigned to property size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Getter method for property <tt>begin</tt>.
     *
     * @return property value of begin
     */
    public int getBegin() {
        return begin;
    }

    /**
     * Setter method for property <tt>begin</tt>.
     *
     * @param begin value to be assigned to property begin
     */
    public void setBegin(int begin) {
        this.begin = begin;
    }
}
