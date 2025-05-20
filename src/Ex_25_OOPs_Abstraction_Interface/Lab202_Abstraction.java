package Ex_25_OOPs_Abstraction_Interface;

public class Lab202_Abstraction {
    public static void main(String[] args) {
        ConcreteClass c=new ConcreteClass();
        c.display();
        c.display2();
        c.display3();
        System.out.println(c.a);

        System.out.println("====================");
        ConcreteClass2 c2=new ConcreteClass2();
        c2.display();
        c2.display2();
        System.out.println(c2.a);
    }
}
//class ConcreteClass extends Incomplete_abstract implements Incomplete_Interface{//error.. as dispay() method
    //signatures differed
class ConcreteClass implements Incomplete_Interface{
    @Override
    public void display() {
        System.out.println("Hi");
    }
}

class ConcreteClass2 extends Incomplete_abstract{
    @Override
    void display() {
        System.out.println("I m abstract class method..");
    }
}

interface Incomplete_Interface{
    int a=20;//final
    void display();
    default void display2(){
        System.out.println("Default is allowed-display2");
    }

    default void display3(){
        System.out.println("Default is allowed-display3");
    }
}

abstract class Incomplete_abstract{
    int a=10;
    abstract void display();
    void display2(){

    }
}