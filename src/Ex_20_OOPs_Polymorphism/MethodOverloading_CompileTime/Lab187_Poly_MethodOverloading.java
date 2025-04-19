package Ex_20_OOPs_Polymorphism.MethodOverloading_CompileTime;

public class Lab187_Poly_MethodOverloading {
    public static void main(String[] args) {
        MathOperations m1=new MathOperations();
        int r1=m1.add(1,2);
        int r2=m1.add(3,4,5);
        double r3=m1.add(3.13,5.67);
        String s1=m1.add("Prisha ","Vengurlekar");
        System.out.println(s1);
    }
}

class MathOperations{
    // In the same class, When you have a method wit same
    // name but different arguments and different return type.
    int add(int a,int b){
       return a+b;
    }

    int add(int a, int b,int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    String add(String a,String b){
        return a+b;
    }

}