package Ex_24_OOPs_Abstraction_Abstract_class;

public class Lab197_Abstraction_REAL {
    public static void main(String[] args) {
        Employee e=new E1();
        e.mailCheck();
        e.computePay();
        //Employee e1=new Employee();//not allowed

        E1 emp1=new E1();
        emp1.computePay();
        emp1.mailCheck();
    }
}

abstract class Employee{
    private String name;
    private String address;
    private int number;

    Employee(){
        System.out.println("Employee-- Default constrctor");
    }
    Employee(String name,String address, int num){
        System.out.println("Employee PC");
        this.name=name;
        this.address=address;
        this.number=num;
    }
    abstract double computePay();

    void mailCheck(){
        System.out.println("Mailing to--"+this.name+" "+this.address);
    }
}

class E1 extends Employee{
    @Override
    double computePay() {
        return 0;
    }
}

