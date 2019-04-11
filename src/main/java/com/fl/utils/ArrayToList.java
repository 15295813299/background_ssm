package com.fl.utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

    /**
     * String数组转Integer
     * @param ids
     * @return 一个整型list集合
     */
    public static List<Integer> arrayToList(String[] ids){
        List<Integer> list = new ArrayList<Integer>();
        for (String s :ids) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }
}
