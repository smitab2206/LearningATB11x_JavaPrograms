package Ex_27_Static;

public class Lab206_Static {
    public static void main(String[] args) {
        A ref1=new A(50);
        ref1.displayValue();
        System.out.println(ref1.a);
        System.out.println(A.b);//static variables can be called directly,without creating an object/reference
        A.b=45;

        System.out.println("============");
        A ref2=new A(100);
        ref2.displayValue();
        System.out.println(ref2.a);
        System.out.println(A.b);

        System.out.println("===========");
        A ref3 = new A(200);
        System.out.println(A.b);
    }
}
class A{
    int a=10;//non-static --> Instance variable/properties/attribute/field
    static int b=20;//static variable

    A(int a){//Parameterized constructor
        this.a=a;
        System.out.println("value of a="+this.a);
    }

    void displayValue(){//Non-static function
        System.out.println(this.a);
    }
}
