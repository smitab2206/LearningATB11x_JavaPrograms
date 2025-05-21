package Ex_29_Wrapper_Class;

public class Lab215_Wrapper_conversion_Part2 {
    public static void main(String[] args) {
        String num="10";
        int aaa=10;

        //String-->Wrapper-->parseX, Integer.parseInt(num);Double.parseDouble()

        Integer a=Integer.parseInt(num);
        System.out.println(a);
        Integer b=Integer.valueOf(num);
        System.out.println(b);

        //String ==> primitive
        int aa=Integer.parseInt(num);
        System.out.println(aa);

        //String to Wrapper

        //Wrapper to String
        System.out.println(a.toString());

        //Primitive to STring
        int age=40;
        Integer age_wrapper=age;
        System.out.println(age_wrapper.toString());
            }
}
