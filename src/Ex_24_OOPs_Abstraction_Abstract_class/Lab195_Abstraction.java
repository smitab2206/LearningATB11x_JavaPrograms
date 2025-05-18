package Ex_24_OOPs_Abstraction_Abstract_class;

public class Lab195_Abstraction {
    public static void main(String[] args) {
        Child1 c=new Child1();
        c.loan25k();
        c.loan50k();

        // Father F=new Father();//No allowed..cannot create object of abstract class
        Father F=new Child1();
        F.loan25k();
        F.loan50k();
    }

}

abstract class Father{
    void loan25k(){
        System.out.println("Given 25k");
    }

    abstract void loan50k();
}

class Child1 extends Father{
    @Override
    void loan50k() {
        System.out.println("child will pay loan of 50k");
    }
}
