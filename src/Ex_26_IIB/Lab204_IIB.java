package Ex_26_IIB;

public class Lab204_IIB {
    public static void main(String[] args) {
        // ```
        //IIB
        //Instance initialization Block == IIB
        //I will be executed when Object is created.
        //``
        new A1();
    }
}

class A1{
    A1(){
        System.out.println("Default constructor");
    }
    {
        System.out.println("Hi, I am IIB");
        System.out.println("if u want something to be called when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file
    }
    {
        System.out.println("hi, I am IIB 2");
    }
    {
        System.out.println("Hi, I am IIB 3");
    }
}
