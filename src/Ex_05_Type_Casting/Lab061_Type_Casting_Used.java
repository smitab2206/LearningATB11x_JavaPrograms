package Ex_05_Type_Casting;

public class Lab061_Type_Casting_Used {
    public static void main(String[] args) {
        int course=100;
        float GST=18.45f;
        //int total=course+GST;//Narrow Implicit
        int total1=course+(int) GST;
        System.out.println(total1);// o/p 118 (data loss)

        float total2=course+GST;//widening Implicit- auto
        System.out.println(total2);//o/p 118.45
        float total3=(float)course+GST;//widening Explicit
        System.out.println(total3);//o/p 118.45


    }
}
