/*********************************************************************
 * Solution to exercises in Algorithms Fourth Edition
 * by Robert Sedgewick and Kevin Wayne
 *
 * Exercise 1.1.14
 *
 * Copyright 2014 David Leung
 * Released under the MIT license
 ********************************************************************/


public class Ex1_1_14 {
    public static int lg(int N) {
        int x = 0;
        for (int n = N; n > 1; n/=2) x++;
        return x;
    }

    public static void main(String[] args) {
        assert lg(8) == 3;
        assert lg(15) == 3;
        assert lg(255) == 7;
    }
}
