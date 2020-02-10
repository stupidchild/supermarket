package com.xinba.supermarket.controller.request;

import com.xinba.supermarket.entity.Supermarket;

public class SuperMarketRequestParam extends PageRequest {

    private Supermarket supermarket;

    /**
     * Getter method for property <tt>supermarket</tt>.
     *
     * @return property value of supermarket
     */
    public Supermarket getSupermarket() {
        return supermarket;
    }

    /**
     * Setter method for property <tt>supermarket</tt>.
     *
     * @param supermarket value to be assigned to property supermarket
     */
    public void setSupermarket(Supermarket supermarket) {
        this.supermarket = supermarket;
    }
}
