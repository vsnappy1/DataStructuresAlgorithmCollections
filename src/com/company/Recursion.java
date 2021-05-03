package com.company;

import java.util.HashMap;

public class Recursion {


    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static String reverseString(String text) {
        if (text.equals("")) {
            return "";
        }

        return reverseString(text.substring(1)) + text.charAt(0);
    }

//
//    static long fibonacciNumber(int n){
//        System.out.println(n);
//        if(n == 1 || n == 2){
//            return 1;
//        }
//
//        return fibonacciNumber(n - 2) + fibonacciNumber(n - 1);
//    }

    static HashMap<Integer, Long> hashMap = new HashMap<>();

    static long fibonacciNumber(int n) {
        System.out.println(n);
        if (n == 1 || n == 2) {
            return 1;
        }
        long fN2;
        long fN1;

        if(hashMap.containsKey(n-2)){
            fN2 = hashMap.get(n-2);
        }
        else {
            fN2 = fibonacciNumber(n - 2);
        }

        if(hashMap.containsKey(n-1)){
            fN1 = hashMap.get(n-1);
        }
        else {
            fN1 = fibonacciNumber(n - 1);
        }

        hashMap.put(n,fN2 + fN1);

        return  fN2 + fN1 ;
    }


}
