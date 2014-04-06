public class Ex1_1_13 {
    public static void printTranspose(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                StdOut.printf("%d ", matrix[i][j]);
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
