package Ex_27_Static;

public class Lab207_Static {
    public static void main(String[] args) {
        B.commonToAll();
        System.out.println(B.b);
        System.out.println("=======");
        B ref=new B();
        System.out.println(ref.a);
        ref.display();
    }
}
class B{
    static {
        System.out.println("SIB, called once, class is loaded");
    }
    int a=10;//non-static variable
    static int b=20;//static variable

    void display(){//non-static method
        System.out.println(b);//static variable can be used in non-static method
    }

    static void commonToAll(){//static method
        //System.out.println(a);//NON-static variable cannot be used in static method
        System.out.println("Static method");
    }

    //    static class C{
//        // Not useful
//    }

}