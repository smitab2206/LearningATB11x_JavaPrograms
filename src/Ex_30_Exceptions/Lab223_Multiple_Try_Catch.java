package Ex_30_Exceptions;

public class Lab223_Multiple_Try_Catch {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println("Are u a fool..!!");
        }//catch (ArithmeticException e){
           // System.out.println("Are u a fool1..!!");
        //}
        // Not possible as Big Exception is used before
//        catch (ArithmeticException e){
//            System.out.println("ARE YOU FOOL");
//        }
        System.out.println("2");
    }
}
