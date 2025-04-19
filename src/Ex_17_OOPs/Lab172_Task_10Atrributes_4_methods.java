package Ex_17_OOPs;

//Create a Class of a Person with Attributes - 10, Behaviour - all 4 types of methods
//

/// / 1.Without Parameters and Without Return Type
/// / 2.Without Parameters but With Return Type
/// / 3.With Parameters and Without Return Type
/// / 4. With Parameters and With Return Type
public class Lab172_Task_10Atrributes_4_methods {
    public static void main(String[] args) {
        person2 p=new person2();

        p.eat();

        boolean married_or_not=p.marriage_status();
        System.out.println("Person is "+married_or_not);

        p.greeting("Prisha",89897675,21);

        String Person_Works_at = p.company("Delloite");
        System.out.println(Person_Works_at);
    }
}

class person2{
    String name;
    String address;
    long phone;
    String gender;
    boolean is_married;
    float weight;
    float height;
    int age;
    String company_name;
    double salary;

    void eat(){
        System.out.println(" Person is eating");
    }

    boolean marriage_status(){
        is_married=true;
        return is_married;
    }

    void greeting(String name,long phone, int age){
        System.out.println("Person name is "+name+", Phone no. is "+phone+" ,age is "+age);
    }

    String company(String company_name){
        return company_name;
    }
}
