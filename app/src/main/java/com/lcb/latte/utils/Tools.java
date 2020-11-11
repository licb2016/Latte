package com.lcb.latte.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lcb
 * @date 2020-11-10 17:32
 */
public class Tools {


    public static List<Integer> splitInteger(int n, int sum, int m) {
        //随机抽取n-1个小于sum的数
        List<Integer> list = new ArrayList<>();
        //将0和sum加入到里list中
        list.add(0);
        //每个数至少为m
        sum = sum - n * m;
        list.add(sum);

        //生成n-1个小于sum的随机数
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            temp = (int) (Math.random() * sum);
            list.add(temp);
        }
        Collections.sort(list);

        List<Integer> valueList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            //每份最少为m
            valueList.add(list.get(i + 1) - list.get(i) + m);

        }
        return valueList;
    }


} 