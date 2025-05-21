package Ex_29_Wrapper_Class;

public class Lab212_Primitive_Wrapper {
    public static void main(String[] args) {
        int a=10;//primitive data type.
        //This is not an Object
        //It will not have attribute and behaviour

        //char,short,long,byte,float double,int- we will avoid using them now.

        //We will use Wrapper classes
        //Character,Boolean,Long,Short, Float,Double

        Integer age=65;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.compare(7,5));
        System.out.println(age);
        System.out.println(age.intValue());
    }
}
