package Ex_25_OOPs_Abstraction_Interface;

public class Lab199_I {
    public static void main(String[] args) {
        Car c=new Car();
        c.startEngine();
        c.applyBrakes();
        c.stopEngine();
        c.test();
    }
}

interface Engine{
    void startEngine();
    void stopEngine();

    default void test(){//by specifying default, You told the compiler:
        //"This method has a default implementation, and it’s okay to provide a method body inside the interface."
        //This is completely legal starting from Java 8.
        System.out.println("concrete complete");
    }
}
interface Brakes{
    void applyBrakes();
}

class Car implements Engine,Brakes{
    @Override
    public void startEngine() {
        System.out.println("Engine started..");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine Stopped..");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Brakes applied..");
    }
}