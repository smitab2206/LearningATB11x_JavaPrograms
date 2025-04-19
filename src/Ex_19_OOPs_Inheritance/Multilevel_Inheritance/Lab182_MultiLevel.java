package Ex_19_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab182_MultiLevel {
    public static void main(String[] args) {

        Grandfather gf1=new Grandfather();
        gf1.gf();
        System.out.println("----------------------------");

        Father f1=new Father();
        f1.gf();
        f1.f();

        System.out.println("----------------------------");

        Son s1=new Son();
        s1.gf();
        s1.f();
        s1.s();

    }
}
