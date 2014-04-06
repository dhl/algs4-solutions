/*********************************************************************
 * Solution to exercises in Algorithms Fourth Edition
 * by Robert Sedgewick and Kevin Wayne
 * 
 * Exercise 1.1.13
 * 
 * Copyright 2014 David Leung
 * Released under the MIT license
 ********************************************************************/


public class Ex1_1_13 {
    public static void printTranspose(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                String padding = matrix.length == i+1 ? "": " ";
                StdOut.printf("%d%s", matrix[i][j], padding);
            }
            StdOut.println();
        }
    }
    
    public static void main(String[] args) {
        // test printTranspose
        int[][] testMatrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}}; 
        printTranspose(testMatrix);
    }
}
