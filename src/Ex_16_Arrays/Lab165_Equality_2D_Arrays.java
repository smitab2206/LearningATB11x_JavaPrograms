package Ex_16_Arrays;

import java.util.Arrays;

public class Lab165_Equality_2D_Arrays {
    public static void main(String[] args) {
        int[][] array1={{1,2},{3,4}};
        int[][] array2={{1,2},{3,4,6}};

        boolean areEqual= Arrays.deepEquals(array1,array2);
        if (areEqual){
            System.out.println("Both are equal");
        }else {
            System.out.println("NOT equal");
        }
    }
}
