package Ex_01_JavaBasic;

import java.util.Scanner;

public class Printing_Math_Table {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number whose Table needs to be printed: ");
        int num=sc.nextInt();
        int num1=num;
        //int num=9;
        //int num1=9;
        //%d --> int, byte,long,short
        //%s -->String
        //%f -->float,double
        //%b -->boolean
        System.out.printf("%d X 1 = %d\n",num,num1*1);
        System.out.printf("%d X 2 = %d\n",num,num1*2);
        System.out.printf("%d X 3 = %d\n",num,num1*3);
        System.out.printf("%d X 4 = %d\n",num,num1*4);
        System.out.printf("%d X 5 = %d\n",num,num1*5);
        System.out.printf("%d X 6 = %d\n",num,num1*6);
        System.out.printf("%d X 7 = %d\n",num,num1*7);
        System.out.printf("%d X 8 = %d\n",num,num1*8);
        System.out.printf("%d X 9 = %d\n",num,num1*9);
        System.out.printf("%d X 10 = %d\n",num,num1*10);
    }
}
