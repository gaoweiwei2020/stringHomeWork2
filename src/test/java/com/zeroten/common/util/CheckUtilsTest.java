package com.zeroten.common.util;


import org.junit.Test;
import org.testng.Assert;

public class CheckUtilsTest {
    @Test
    public void  isAnyEmptyTest(){
        String[] string1 = {"test" , "test1" , "test33"};
        String[] string2 = {"" , "test1" , "test33"};
        String[] string3 = {null, "test1" , "test33"};
        String[] string4 = {"" , "" , ""};
        String[] string6 = {"test" , null, "test33"};
        String[] string7= {"test" , "" , "test33"};
        String[] string8 = {"test" , "test1" , ""};
        String[] string9 = {"test" , "test1" , null};

        Assert.assertEquals(CheckUtils.isAnyEmpty(string1) , true);
        Assert.assertEquals(CheckUtils.isAnyEmpty(string2) , false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(string3) , false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(string4) , false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(string6) , false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(string7) , false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(string8) , false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(string9) , false);


    }


    @Test
    public void isEmptyTest() {
        int[] a = {1,2};
        char[] b = {'c' , 'd'};
        float[] dddd = {5.5f , 3.3f};
        double[] ss = {6.6 , 0};
        String[] s = {"ddd" , "dfff"};
        String v = null;
        int[] dd = null;
        Object[] o1 = {a,b,ss,dddd , s,v,dd};

        Assert.assertEquals(CheckUtils.isEmpty(o1) , true);
    }

    @Test
    public void stringEqualsTest() {
        String str1= "hello " + "world";
        String str2= "hello world";
        String str3 = str2.intern();
        String str4 = "hello " ;

        String string5 =  str4 + "world";
        String str6 = "" ;
        String str7 = null ;
        System.out.println(CheckUtils.equals(str1,str2));
        Assert.assertEquals(CheckUtils.equals(str1,str2) ,true);
        Assert.assertEquals(CheckUtils.equals(str1,str3) ,true);
        Assert.assertEquals(CheckUtils.equals(str2,string5) ,true);
        Assert.assertEquals(CheckUtils.equals(str6,str7) ,false);
        Assert.assertEquals(CheckUtils.equals(str1,str2) ,true);

    }

    @Test
    public void integerEqualsTest() {
        Integer n1 = 6;
        Integer n2 = null;
        Integer n3 = 6;
        Integer n4 = 0;
        Integer n5 = 6;
        Integer n6 = 8;
        Integer n7 = 5;
        Integer n8 = 6;


        Assert.assertEquals(CheckUtils.equals(n1 , n2) , false);
        Assert.assertEquals(CheckUtils.equals(n4 , n2) , false);
        Assert.assertEquals(CheckUtils.equals(n5 , n8) , true);
        Assert.assertEquals(CheckUtils.equals(n6 , n7) , false);
    }

}
