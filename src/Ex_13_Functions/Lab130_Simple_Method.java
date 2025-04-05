package Ex_13_Functions;

public class Lab130_Simple_Method {
    static void smita_f1(){
        System.out.println("No Return");
    }

    static int return_int(){
        return 10;
    }

    static float return_float(){
        return 3.14f;
    }

    static long return_long(){
        return 10l;
    }
    static boolean return_boolean(){
        return true;
    }

    static byte return_byte(){
        return 100;
    }

    static String return_String(){
        return "Smita";
    }
    static int f2(int a,int b){
        return a+b;
    }



    public static void main(String[] args) {
        smita_f1();

        int result=return_int();
        System.out.println(result);

        float f=return_float();
        System.out.println(f);

        long l=return_long();
        System.out.println(l);

        boolean b=return_boolean();
        System.out.println(b);

        byte byte1=return_byte();
        System.out.println(byte1);

        String s=return_String();
        System.out.println(s);
    }
}
