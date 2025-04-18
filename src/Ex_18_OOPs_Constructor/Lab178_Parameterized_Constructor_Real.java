package Ex_18_OOPs_Constructor;

public class Lab178_Parameterized_Constructor_Real {
    public static void main(String[] args) {
        person p1=new person("AMIT",656346534,"abc");
        person p2=new person("Pramod",997878687,"xyz");

        person p3=new person();
        p3.name="shikha";
        System.out.println(p3.name);

        person p4=new person("Lucky",52534);
        System.out.println(p4.name);

        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }




}

class person{
    String name;
    long phone;
    String address;

    //DC
    person(){
    }

    //PC
    person(String name_arg,long phone_arg,String address_arg){
        this.name=name_arg;
        this.phone=phone_arg;
        this.address=address_arg;
    }

    person(String name_arg,long phone_arg){
        this.name=name_arg;
        this.phone=phone_arg;
    }

    void eat(){
        System.out.println(this.name+" is eating");
    }
}