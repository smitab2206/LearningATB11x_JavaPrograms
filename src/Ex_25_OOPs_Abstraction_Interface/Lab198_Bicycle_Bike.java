package Ex_25_OOPs_Abstraction_Interface;

public class Lab198_Bicycle_Bike {
    public static void main(String[] args) {
        HeroCycle hero=new HeroCycle();
        hero.applyBrake();
        hero.speedUp();
        hero.applyBrakeBike();
    }
}

interface Bicycle1{
    void applyBrake();
    void speedUp();
}

interface Bike{
    void applyBrakeBike();
}

class HeroCycle implements Bicycle1,Bike{
    @Override
    public void applyBrake() {
        System.out.println("Apply bicycle brakes");
    }

    @Override
    public void speedUp() {
        System.out.println("Increase Bicycle Speed");
    }

    @Override
    public void applyBrakeBike() {
        System.out.println("apply Bike brakes");
    }
}