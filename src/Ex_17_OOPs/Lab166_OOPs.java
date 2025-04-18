package Ex_17_OOPs;

public class Lab166_OOPs {
    public static void main(String[] args) {
        person amit=new person();
        person p2=new person();
        //person - class
        //p2 - object reference
        //new person() - object

        p2.name = "Lucky";
        System.out.println(p2.name);

        person p3  = new person();
        p3.name = "Pramod";
        System.out.println(p3.name);

        new person().name="No ref name";
    }
}

class person{
    //Attribiutes | Properties |data members | instance variables
    String name;
    String phone;
    String color_eyes;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean isMale;

    //behaviour | methods | functions
    void sleep(){
        System.out.println("I am sleeping");
    }

    String greet(){
        return "Hello "+name;
    }

    int remaining_amount_salary(int salary,int tax){
        return salary-tax;
    }
}