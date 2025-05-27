package Ex_30_Exceptions;

import java.util.Scanner;

public class Lab234_Throw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age=sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void validateAge(int age) throws ArithmeticException,NullPointerException,Exception{
        if (age< 18){
            throw new Exception("You can't go out,else u will be out of the house");
            //throw new NotValidAgeException("Not a valid Age");
        }
    }
}


