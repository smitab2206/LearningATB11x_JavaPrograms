package Ex_26_IIB;

public class Lab203_IIB {
    public static void main(String[] args) {
        A a;//no output
        A a1=new A();
        // First class is loaded i.e. Class A in above example(SIB will be called)
        //Then reference(instance) is created
        //Then object is created(IIB and Default Constructor will be called)
        System.out.println("======================");
        new A();//SIB won't be called again, Only IIB and DC will be executed
    }
}

class A{
    A(){
        System.out.println("Default constructor..");
    }
    {
        System.out.println("IIB(Instance Initialisation Block)");
    }
    static {
        System.out.println("SIB(Static Initialisation Block)");
    }
}
