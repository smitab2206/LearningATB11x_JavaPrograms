package Ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_Highest {
    public static void main(String[] args) {
        // Find Second Largest Number in an Array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        // 100 , 34

        Arrays.sort(numbers);

        System.out.println("2nd highest number is "+numbers[numbers.length-2]);
        System.out.println("3rd highest number is "+numbers[numbers.length-3]);
    }
}
