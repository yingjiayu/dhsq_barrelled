package com.dhsq.common.utils;

/**
 * Created by jerry on 2017/6/27.
 */
public class CommonUtil {
    public static String chengeCase(String oldString){
        if (oldString!=""&&!oldString.isEmpty()){
            return oldString.toUpperCase();
        }else {
            return "";
        }
    }
}
