package Ex_13_Functions;

public class Lab131_User_Defined_1 {
    static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        int result=sum(3,4);
        System.out.println("Sum is "+result);

        int result1=sum(100,200);
        System.out.println("Sum is "+result1);
    }
}
