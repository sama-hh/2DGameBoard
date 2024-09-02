package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Your task is to develop a Java program together that implements a function to calculate the so-called 'n-th Fibonacci number'.
// The Fibonacci numbers are a series of numbers in which each number is the sum of the two preceding numbers.
// The Fibonacci sequence starts with the numbers 0 and 1, and the next numbers are 1, 2, 3, 5, 8, 13, 21, etc.
//
//  {0,1,1,2,3,5,8,13,21...}
//
// First, write a test case for the Fibonacci function and ensure that it fails (since the function is not yet implemented).
// Then, gradually implement the function to pass the test successfully. Write additional tests to ensure that the function works correctly.

public class FibonacciTest {
    @Test
    void fibonacci_checkFor8(){
        //Given
        int number = 8;
        int expected = 21;
        //When
        int actual = Fibonacci.fibonacci(number);
        //Then
        Assertions.assertEquals(expected, actual);
    }

}


