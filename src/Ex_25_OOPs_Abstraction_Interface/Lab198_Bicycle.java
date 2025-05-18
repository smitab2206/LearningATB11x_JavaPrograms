package Ex_25_OOPs_Abstraction_Interface;

public class Lab198_Bicycle {
    public static void main(String[] args) {
        AvonCycle cycleSmita=new AvonCycle();
        cycleSmita.applyBrake(5);
        cycleSmita.speedUp(3);
        System.out.println(cycleSmita.a);

        //cycleSmita.a=454;//error,as u cannot modify the properties in Interface, as the are final
    }
}
interface Bicycle{
    int a=45;// can create properties in interface
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    int speed=7;
    @Override
    public void applyBrake(int decrement) {
        speed=speed-decrement;
        System.out.println("applyBrake--"+speed);
    }

    @Override
    public void speedUp(int increment) {
        speed=speed+increment;
        System.out.println("speedUp--"+speed);
    }
}