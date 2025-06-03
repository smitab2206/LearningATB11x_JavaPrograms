package Ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab251_use_Input_AL {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // Multiple inputs from the user and store them in separate
        // names, ages - store them

        ArrayList<String> names=new ArrayList<>();
        ArrayList<Integer> ages=new ArrayList<>();

        String continueInput="Y";// Control variable for input loop

        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter the name: ");
            String name= scanner.next();
            names.add(name);

            System.out.println("Enter the age: ");
            Integer age= scanner.nextInt();
            ages.add(age);

            scanner.nextLine();
            System.out.println("Do you want to enter another record? (Y/N)");
            continueInput= scanner.nextLine();
        }

        for (Object O1: names){
            System.out.println(O1);
        }

        for (Object O2:ages){
            System.out.println(O2);
        }
    }
}
