package Ex_30_Exceptions;

public class Lab229_JrQA_VS_SrQA_2 {
    public static void main(String[] args) {
        //QA
        try {
            String ip=args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a=Integer.parseInt(ip);// NumberFormatException
            int b=100/a;
            // ArithmeticException
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
