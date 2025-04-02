package Ex_02_JavaBasics_Part2;

public class Lab024_printF {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("Your variable is %d", a);
        //%d --> int, byte,long,short
        //%s --> String
        //%f --> float,double
        //%b --> boolean
        int b = 20;
        int c=a+b;
        System.out.println("----");
        System.out.printf("Addition of %d + %d is %d",a,b,c);
    }
}
