package Ex_07_Increment_Decrement_Op;

public class Lab071_Post_ID {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a);//11
        System.out.println(a);//11

        // POST increment  = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++); // 10
        System.out.println(a_post);//11
    }
}
