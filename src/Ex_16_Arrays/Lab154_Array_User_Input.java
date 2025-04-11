package Ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array(int) only");
        int size=sc.nextInt();

        int[] numbers_marks=new int[size];

        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println("Enter the numbers");
            numbers_marks[i]=sc.nextInt();
        }

        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println(numbers_marks[i]);
        }
    }
}
