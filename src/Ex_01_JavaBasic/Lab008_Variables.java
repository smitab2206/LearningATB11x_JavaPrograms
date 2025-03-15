package Ex_01_JavaBasic;

public class Lab008_Variables {
    public static void main(String[] args) {
        //Example 1:
        int a = 10;
        a=65+1;
        System.out.println(a);//o/p==>66
        //example 2
        int age= 76;
        age=age+1;
        age=76;
        System.out.println("age =" +age);//o/p==> 76
        //let me know if below examples are allowed
        int _ =65;//allowed but avoid using it like this
        int $=70;//allowed but avoid using it like this
        int this_is_a_very_long_variable_name_54567654 =89;////allowed but avoid using it like this
        int _2=123;//allowed

        //int enum = 10;//not allowed, as enum is a keyword'
        int Enum = 10;//allowed
        //int pramod datta = 40;//Not allowed
        int pramod$datta=40;//allowed
        int Lab003=987;//allowed

        boolean is_pramod_married=true;
        //boolean smita_has_audi=6;//not allowed

        //byte b=128;//Not allowed.. -128 to 127

    }
}
