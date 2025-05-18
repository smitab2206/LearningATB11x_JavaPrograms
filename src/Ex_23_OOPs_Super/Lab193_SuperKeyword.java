package Ex_23_OOPs_Super;

public class Lab193_SuperKeyword {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car(100);

        c1.display();
    }


}

class vehicle{
    int maxSpeed=180;

    vehicle(){
        System.out.println("Defalt constructor- Parent");
    }

    vehicle(int a){
        System.out.println("Parameterized Constructor -Parent");
    }

    // Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No return,No argument (message function");
    }
    void message(int a){
        System.out.println("No return,With argument (message function");
    }

    void display(){
        System.out.println("display funtion-Vehicle Parent");
    }
}

class Car extends vehicle{
    int maxSpeed=280;
    Car(){
        super();
        System.out.println("DC-Car");
    }

    Car(int a){
        super(10);
        System.out.println("PC-Car");
    }


    @Override
    void display() {
        System.out.println(this.maxSpeed); //car class maxspeed

        //parent
        super.display();// call parent display method
        super.message();
        super.message(10);
        System.out.println(super.maxSpeed);
    }
}