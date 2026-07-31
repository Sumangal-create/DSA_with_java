import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int [][]A={
            {1,3,4,2},
            {6,2,1,8},
            {3,9,5,1},
            {1,3,2,5},
        };

        int [][]B={
            {1,3,4,2},
            {6,2,1,8},
            {3,9,5,1},
            {1,3,2,5},
        };

        int[][] C = multiply(A,B);
    }
}