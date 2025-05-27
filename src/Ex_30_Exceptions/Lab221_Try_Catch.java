package Ex_30_Exceptions;

public class Lab221_Try_Catch {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Are u a fool..!!");
        }
        //}catch (Exception e) {
        //System.out.println("Are u a fool..!!");
        //}
        System.out.println("2");
    }
}
