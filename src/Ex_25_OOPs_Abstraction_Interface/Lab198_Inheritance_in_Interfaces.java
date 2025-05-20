package Ex_25_OOPs_Abstraction_Interface;

public class Lab198_Inheritance_in_Interfaces {
    public static void main(String[] args) {
        MySampleClass obj=new MySampleClass();
        obj.math1();
        obj.math2();
    }
}
interface sampleInterface{
    void math1();
}

interface childSampleInterface extends sampleInterface{
    void math2();
}

class MySampleClass implements childSampleInterface{
    @Override
    public void math2() {
        System.out.println("math2");
    }

    @Override
    public void math1() {
        System.out.println("math1");
    }
}