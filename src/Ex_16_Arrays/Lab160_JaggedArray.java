package Ex_16_Arrays;

public class Lab160_JaggedArray {
    public static void main(String[] args) {
        // Java allows jagged arrays where each row can have a different length
        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7}
        };
        System.out.println(jaggedArray[2][0]);//o/p 7
        //System.out.println(jaggedArray[2][1]);//error-Index 1 out of bounds for length 1

        System.out.println(jaggedArray[0][1]);//o/p 2
    }
}
