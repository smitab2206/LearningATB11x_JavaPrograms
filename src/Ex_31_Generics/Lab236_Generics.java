package Ex_31_Generics;

public class Lab236_Generics {
    public static void main(String[] args) {
        System.out.println(temp_sum(3,4));
        System.out.println(temp_sum(3.14,3.14));
        System.out.println(temp_sum("ABC","DEF"));
    }
    static int temp_sum(int a,int b){
        return a+b;
    }

    static double temp_sum(double a,double b){
        return a+b;
    }

    static String temp_sum(String a,String b){
        return a+b;
    }
}

