package Tasks;

import java.util.Scanner;

public class Task006_Triangle_Class_HR {
    public static void main(String[] args) {
        // ✅ Triangle Classifier:
        //
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        //int s1=Integer.parseInt(args[0]);
        //int s2=Integer.parseInt(args[1]);
        //int s3=Integer.parseInt(args[2]);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of side1");
        int side1=sc.nextInt();
        System.out.println("Enter length of side2");
        int side2=sc.nextInt();
        System.out.println("Enter length of side3");
        int side3=sc.nextInt();

        //first we will check edge values
        if (side1<=0 || side2<=0 || side3<=0){
            System.out.println("It is NOT a Triangle");
            System.exit(0);
        }

        if (side1+side2 <= side3 || side1+side3 <= side2 || side2+side3 <= side1){
            System.out.println("It is NOT a Triangle");
            System.exit(0);
        }

        if (side1 == side2 && side2== side3){
            System.out.println("Equilateral Triangle");
        }else if (side1==side2 || side2==side3 || side1==side3){
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("Scalene Triangle");
        }

       sc.close();
    }
}
