package Ex_24_OOPs_Abstraction_Abstract_class;

public class Lab196_AB_Cars {
    public static void main(String[] args) {
        //Engine e=new Engine();//Not allowed

        WagonR W=new WagonR();
        W.drive();

        Engine e=new WagonR();
        e.normal();
        e.startEngine();
        e.stopEngine();
    }
}

abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();

    void normal(){
        System.out.println("Normal function..");
    }
}

class WagonR extends Engine{//complete class.. no abstract methods
    @Override
    void startEngine() {
        System.out.println("Engine started..");
    }

    @Override
    void stopEngine() {
        System.out.println("Engine stopped..");
    }

    void drive(){
        startEngine();
        stopEngine();
    }
}
