public class problem5e {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1; // Size of the matrix (7x7 for n=4)
        int[][] matrix = new int[size][size];
        
        // Fill the matrix
        for (int layer = 0; layer < n; layer++) {
            int value = n - layer;
            for (int i = layer; i < size - layer; i++) {
                for (int j = layer; j < size - layer; j++) {
                    matrix[i][j] = value;
                }
            }
        }
        
        // Print the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}