package Ex_20_OOPs_Polymorphism.MethodOverriding_RunTime;

public class Lab189_MOverriding {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();

        Animal a1=new Dog();
        a1.sound();

    }
}
class Animal{
    void sound(){
        System.out.println("Animal Sounds!!");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark!!");
    }
}