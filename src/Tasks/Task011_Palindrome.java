package Tasks;

import java.util.Scanner;

public class Task011_Palindrome {
    public static void main(String[] args) {
    //e.g. "naman"
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter User input, to check if it is palindrom or not: ");
        String UserInput=sc.next();
        //String newString=ReversedString(UserInput);
        String newString=ReversedStringSB(UserInput);
        if (newString.equalsIgnoreCase(UserInput)){
            System.out.println("It is a Palindrome");
        }else {
            System.out.println("It is NOT a Palindrome");
        }
    }

    private static String ReversedString(String UserInput) {
        String reversed="";

        for (int i = UserInput.length()-1; i >=0  ; i--) {
            reversed=reversed + UserInput.charAt(i);

        }
        return reversed;
    }

    private static String ReversedStringSB(String UserInput){
        StringBuilder SB=new StringBuilder(UserInput);
        return SB.reverse().toString();
    }
}
