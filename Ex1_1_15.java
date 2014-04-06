/*********************************************************************
 * Solution to exercises in Algorithms Fourth Edition
 * by Robert Sedgewick and Kevin Wayne
 *
 * Exercise 1.1.15
 *
 * Copyright 2014 David Leung
 * Released under the MIT license
 ********************************************************************/


public class Ex1_1_15 {
    public static int[] histogram(int[] a, int M) {
        int[] result = new int[M];
        for (int i = 0; i < a.length; i++) {
            result[a[i]]++; 
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 0,2, 4, 5, 6, 1, 1, 1, 1};
        int[] result = histogram(a, 7);
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum += result[i];
        }
        assert sum == a.length;
    }
}
