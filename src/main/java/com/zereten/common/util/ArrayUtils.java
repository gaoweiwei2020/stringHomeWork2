package com.zereten.common.util;

import java.util.Arrays;

public class ArrayUtils {
    public static int[] sort(int[] arr) {
        int[] newStr = Arrays.copyOf(arr , arr.length);

        for(int indexStart = 0 ; indexStart < arr.length - 1 ; indexStart++){
            for(int indexSecond = indexStart + 1 ; indexSecond < arr.length;indexSecond++){
                if(newStr[indexStart] > newStr[indexSecond]){
                    int temp = newStr[indexStart];
                    newStr[indexStart] = newStr[indexSecond];
                    newStr[indexSecond] = temp;
                }
            }
        }

        return newStr ;
    }
}
