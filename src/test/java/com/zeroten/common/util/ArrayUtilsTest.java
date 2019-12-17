package com.zeroten.common.util;

import com.zereten.common.util.ArrayUtils;
import org.junit.Test;
import org.testng.Assert;

import java.util.Arrays;

public class ArrayUtilsTest {
    @Test
    public void arrayUtilsTest() {

        int[] arr1 = new int[]{1,75,666,33,4,5,7,8,9,0,14,15,16,14};
        int[] arr2 = new int[]{0,1,4,5,7,8,9,14,14,15,16,33,75,666};
        System.out.println(Arrays.toString(ArrayUtils.sort(arr1)));
        Assert.assertEquals(ArrayUtils.sort(arr1) , arr2);
    }
}
