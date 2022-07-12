package com.lisa.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MaxNumberTest {

    private  MaxNumber maxNumber;
    private int maxNumberFound;

    @BeforeEach
    public void setUp(){
        maxNumber = new MaxNumber();
    }

    @Test
    public void testMaxNumberInPositiveNumbersIsFound(){
        maxNumberFound = maxNumber.findMaxNumber(new Integer[]{2,56,34,5689});
        assertThat(maxNumberFound, is(5689));
    }

    @Test
    public void testMaxNumberInNegativeNumbersIsFound(){
        maxNumberFound = maxNumber.findMaxNumber(new Integer[]{-9,-3});
        assertThat(maxNumberFound, is(-3));
    }

    @Test
    public void testMaxNumberInEmptyArrayOfNumbersThrowsException(){
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            maxNumber.findMaxNumber(new Integer[]{});
        }, "ArrayIndexOutOfBoundsException was expected");

    }
}
