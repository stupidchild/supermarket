package com.xinba.supermarket.common;

import org.springframework.ui.ModelMap;

public interface ControllerTempLate {

    void verifier(ModelMap modelMap) throws XinbaException;

    void business(ModelMap modelMap) throws XinbaException;
}
