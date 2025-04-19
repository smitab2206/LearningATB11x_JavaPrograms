package Ex_19_OOPs_Inheritance;

public class Lab180_Inheritance {
    public static void main(String[] args) {
        father f=new father();
        System.out.println(f.gold_f);
        f.bhk2();
        //f.bhk3();

        son s=new son();
        System.out.println(s.gold_f);
        s.bhk2();
        s.bhk3();
    }
}
class father{
    int gold_f=1000;// Attribute | Data variables |  Property | Instance Variables

    void bhk2(){ //  Behaviour |  Method | Function | Data members
        System.out.println("Father - 2BHK");
    }
}

class son extends father{
    void bhk3(){
        System.out.println("Son - 3BHK");
    }
}