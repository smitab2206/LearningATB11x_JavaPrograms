package Ex_06_TernaryOperator;

public class Lab067_TO_Three_Max {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        // Logic Building formula

        // Step 1 : Find inputs /outputs
        // I/O -> n1,n2,n3 - int
        // O/P -> String ->  max number

        // Step 2 - Rough Logic, Think about it.
        // n1 > n2 and n1  > n3 -> n1
        // n2 > n3 and n2>  n1 ->  n2
        // n3

        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
        System.out.println("Max ix " + max);

        // A -> (n1 > n3) ? n1 : n3

        int a=10;
        int b=20;
        int c=30;

        int result = (a>b) ? (a>c) ? a : c : ((b>c) ? b :c);
        System.out.println(result);
    }
}
