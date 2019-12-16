package com.zeroten.common.util;

public class CheckUtils {
    public static boolean isAnyEmpty(String...strings){
        for(int i = 0 ; i < strings.length ; i++){
            if((strings[i] == "")||(strings[i] == null)){
                return false;
            }
        }
        return true ;
    }


    public static boolean isEmpty(Object[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == null){
                return true ;
            }
        }
        return false;
    }

    public static boolean equals(String str1 , String str2){
        if((str1 == null)||(str2 == null )){
            return false;
        }
        return str1.equals(str2);

    }

    public static boolean equals(Integer n1 , Integer n2){

        if((n1 == null)||(n2 == null)){
            return false;
        }



        return n1.equals(n2);
    }

}
