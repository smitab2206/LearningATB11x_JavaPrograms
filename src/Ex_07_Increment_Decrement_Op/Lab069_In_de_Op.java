package Ex_07_Increment_Decrement_Op;

public class Lab069_In_de_Op {
    public static void main(String[] args) {
        //Take inputs
        String age_string=args[0];
        String a1=args[1];
        String a2=args[2];
        String a3=args[3];
        String a4=args[4];//err- .ArrayIndexOutOfBoundsException, as only 4 values given as an input

        int age=Integer.parseInt(age_string);
        System.out.println(age);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
