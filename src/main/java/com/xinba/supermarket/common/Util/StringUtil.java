package com.xinba.supermarket.common.Util;

public class StringUtil {

    public static boolean isEmpty(String str){
        if (str == null || str.isEmpty()) {
            return false;
        }
        return true;
    }
}
