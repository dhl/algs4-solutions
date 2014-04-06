/*********************************************************************
 * Solution to exercises in Algorithms Fourth Edition
 * by Robert Sedgewick and Kevin Wayne
 * 
 * Exercise 1.1.3
 * 
 * The solution provided here is capable of handling arbitrarily long
 * inputs from the command line.
 * 
 * Copyright 2014 David Leung
 * Released under the MIT license
 ********************************************************************/

public class Ex1_1_3 {

    public static void main(String[] args) {
        
        int firstInput = Integer.parseInt(args[0]);
        
        for (int i = 1; i < args.length; i++) {
            if (Integer.parseInt(args[i]) != firstInput) {
                StdOut.println("not equal");
                return;
            }
        }
        StdOut.println("equal");
    }
}