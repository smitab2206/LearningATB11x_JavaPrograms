package Ex_24_OOPs_Abstraction_Abstract_class;

public class Lab195_program1 {
    public static void main(String[] args) {
       // Parent p=new Parent();// Not allowed.. its an abstract class
        Child c=new Child();//allowed
        c.greet_morning();
        c.greet_afternoon();
        c.sayhello();
        System.out.println("-------------");
        //child2 c2=new child2();//Not allowed..its an abstract class
        Parent p=new Child();
        p.sayhello();
        p.greet_morning();
        p.greet_afternoon();

        System.out.println("-------------");

    }
}

abstract class Parent{
    public Parent(){
        System.out.println("I am constructor of Parent..");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet_morning();//abstract method, implementation not done
    abstract public void greet_afternoon();//abstract method, implementation not done
}

class Child extends Parent{
    @Override
    public void greet_morning() {
        System.out.println("Good morning..");
    }

    @Override
    public void greet_afternoon() {
        System.out.println("Good Afternoon..");
    }
}

abstract class child2 extends Parent{
    public void thanks(){
        System.out.println("Thanks..");
    }
}
