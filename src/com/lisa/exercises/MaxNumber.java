package com.lisa.exercises;

import java.sql.SQLOutput;

public class MaxNumber {

    public static void main(String[] args) {
        System.out.println(findMaxNumber(new Integer[]{2,6,4,1}));
    }

    private static int findMaxNumber(Integer[] integers) {
        int max = 0;
        for (int i : integers){
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
