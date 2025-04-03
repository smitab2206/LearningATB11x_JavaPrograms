package Ex_04_Operators;

public class Lab043_Interview_Concat_plus {
    public static void main(String[] args) {
        String first_name = "Pramod";
        String last_name = "Dutta";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // // PramodDutta1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);
        //o/p 20PramodDutta


        System.out.println(first_name + last_name + (a + b));
        //o/p PramodDutta20
        // BODMAS - Bracket of Div, mul, add, sub

    }
}
