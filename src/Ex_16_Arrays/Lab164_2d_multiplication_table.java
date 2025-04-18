package Ex_16_Arrays;

import java.util.Scanner;

public class Lab164_2d_multiplication_table {
    public static void main(String[] args) {
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose table needs to be printed: ");
        int n=sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n+" x "+i+" = "+n*i);
        }
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int Size_of_the_Table = scanner.nextInt();

        for (int i = 1; i <= Size_of_the_Table; i++) {
            for (int j = 1; j <= Size_of_the_Table; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t\t");
                //System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
