package Ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else {
    public static void main(String[] args) {
        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        // How to take the user Input
        // 1. CLI Options
        //
//        int age = Integer.parseInt(args[0]);

        //2. Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age!");
        int age=sc.nextInt();
        System.out.println(age);


        if (age > 18) {
            System.out.println("Allowed to vote!");
        } else {
            System.out.println("Not Allowed!");
        }

    }
}
