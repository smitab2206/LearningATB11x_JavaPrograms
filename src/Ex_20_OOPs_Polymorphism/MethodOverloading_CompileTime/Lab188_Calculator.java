package Ex_20_OOPs_Polymorphism.MethodOverloading_CompileTime;

public class Lab188_Calculator {
    int attribute;
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Lab188_Calculator Cal=new Lab188_Calculator();
        Cal.add(1,2);
        Cal.add(3.14,6.89);
    }

}
