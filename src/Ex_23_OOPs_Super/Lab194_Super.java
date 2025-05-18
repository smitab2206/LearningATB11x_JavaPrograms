package Ex_23_OOPs_Super;

public class Lab194_Super {
    class humans extends God{
        protected String color="Skin color";

        @Override
        void sound() {
            super.sound();
            System.out.println("Human sound -speaking");
        }
    }

    public static void main(String[] args) {
        Dog D=new Dog();
        D.sound();
        D.display();

        Lab194_Super Lab194_Super=new Lab194_Super();
        Lab194_Super.humans H=Lab194_Super.new humans();
        System.out.println(H.color);
        H.sound();
    }
}

class God{
    public String color="Gold";
    void sound(){
        System.out.println("God Sound");
    }
}

class Animals extends God{
    protected String color="white";
    void sound(){
        System.out.println("animal sound");
    }
}

class Dog extends Animals{
    private String color="Black";

    @Override
    void sound() {
        super.sound();
        System.out.println("Dog sound- barking");
    }

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
}