package com.lisa.exercises;

import java.sql.SQLOutput;

public class MaxNumber {

    protected int findMaxNumber(Integer[] integers) {
        int max = integers[0];
        for (int i : integers){
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
