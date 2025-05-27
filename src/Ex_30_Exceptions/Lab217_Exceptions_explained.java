package Ex_30_Exceptions;

public class Lab217_Exceptions_explained {
    public static void main(String[] args) {
        System.out.println("Starting the Program!!");
        String input_user=args[0];// java.lang.ArrayIndexOutOfBoundsExceptio
        int a=Integer.parseInt(input_user); // java.lang.NumberFormatException: For input string
        int output=100/a;// java.lang.ArithmeticException: / by zero
        System.out.println(output);
        System.out.println("ENd of the program..!!");

        // divide by zero -> ?

        // java.lang.ArithmeticException: / by zero when args -> 0
        // java.lang.NumberFormatException: For input string: "pramod"
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds

    }
}
