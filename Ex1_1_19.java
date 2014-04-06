/*********************************************************************
 * Solution to exercises in Algorithms Fourth Edition
 * by Robert Sedgewick and Kevin Wayne
 *
 * Exercise 1.1.19
 *
 * Copyright 2014 David Leung
 * Released under the MIT license
 ********************************************************************/

public class Ex1_1_19 {
    public static long fibonacci(int N) {
        assert N >= 0 : "N must be larger than or equal to zero";
        int len = N < 2 ? 3 : N+1;
        long[] fib = new long[len];
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i < len; i++) {
            fib[i] = fib[i-1]+fib[i-2];
        }
        
        return fib[N];
    }
    
    public static void main(String[] args) {
        assert fibonacci(0) == 0;
        assert fibonacci(1) == 1;
        assert fibonacci(10) == 55;
        assert fibonacci(12) == 144;
        assert fibonacci(20) == 6765;
    }
}