package com.nonwovenit.ztq;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Welcome {

    /**
     * 去重复的算法
     * 时间复杂度O(n²)
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] arr;
        arr = new int[]{1, 2, 3, 3, 55, 3, 5, 6, 6, 7, 8,};

        HashSet set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);//执行N次
        }
        Object[] myArr = set.toArray();
        System.out.println(Arrays.toString(myArr));
    }

    @Test
    public void test() {


        int[] arr = new int[]{1, 2, 3, 3, 55, 3, 5, 6, 6, 7, 8,};

        int size = arr.length;

        List list = new ArrayList();
        for (int i = 0; i < size; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println(list.toString());

    }
}
