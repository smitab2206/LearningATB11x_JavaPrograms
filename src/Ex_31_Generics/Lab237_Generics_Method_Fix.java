package Ex_31_Generics;

public class Lab237_Generics_Method_Fix {
    public static void main(String[] args) {
        System.out.println(temp_sum(3,4));
        System.out.println(temp_sum(3.14,3.14));
        System.out.println(temp_sum("ABC","DEF"));
    }

    static <G> G temp_sum(G a,G b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
