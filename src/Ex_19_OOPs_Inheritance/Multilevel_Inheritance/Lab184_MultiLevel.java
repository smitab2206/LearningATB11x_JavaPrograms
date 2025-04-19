package Ex_19_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab184_MultiLevel {
    public static void main(String[] args) {
        //Son s1=new Grandfather();//Not allowed
        //Son s1=new Father();//Not allowed

        Son amit=new Son();
        amit.s();
        amit.f();
        amit.gf();
        amit.home();

        Father f1=new Father();
        f1.f();
        f1.home();

        Grandfather gf1=new Grandfather();
        gf1.gf();
        gf1.home();

        Grandfather grandfather=new Son();
        grandfather.home();

    }
}
