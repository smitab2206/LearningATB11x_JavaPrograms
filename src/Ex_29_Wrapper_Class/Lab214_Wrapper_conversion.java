package Ex_29_Wrapper_Class;

public class Lab214_Wrapper_conversion {
    public static void main(String[] args) {
        int a=10;//primitive
        Integer b=a;//primitive to wrapper(Autoboxing)

        System.out.println(b.intValue());
        System.out.println(Integer.MIN_VALUE);

        Integer a2=43;
        int b2=a2;//Unboxing==Wrapper is removed,attribute,behaviour is lost
        System.out.println(b2);
    }
}

