package Ex_25_OOPs_Abstraction_Interface;

public class Lab198_Interface {
    public static void main(String[] args) {
    Sqaure s=new Sqaure();
    s.getArea(5,4);

    Rectangle r=new Rectangle();
    r.getArea(5,4);
    }
}
interface polygon{
    void getArea(int l,int b);
}

class Sqaure implements polygon{
    @Override
    public void getArea(int length,int breadth) {
        System.out.println("Area of square = "+3.14*length*breadth);
    }
}

class Rectangle implements polygon{
    @Override
    public void getArea(int l, int b) {
        System.out.println("Area of Rectangle = "+l*b);
    }
}