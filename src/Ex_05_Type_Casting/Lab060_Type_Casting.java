package Ex_05_Type_Casting;

public class Lab060_Type_Casting {
    public static void main(String[] args) {
        long phone_no=8648988586865l;
        //int phone=phone_no;//implicit not allowed
        //short s=phone_no;//implicit not allowed
        short s= (short) phone_no;//Explicit casting- Narrowing
        System.out.println(s);
    }
}
