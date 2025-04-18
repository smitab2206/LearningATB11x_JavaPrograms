package Ex_16_Arrays;

import java.util.Arrays;

public class Lab165_Equality_Arrays {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={1,2,3,4,5,6};

        boolean areEqual= Arrays.equals(array1,array2);
        if (areEqual){
            System.out.println("Both are equal");
        }else {
            System.out.println("NOT equal");
        }
    }
}
