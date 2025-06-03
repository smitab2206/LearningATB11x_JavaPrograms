package Ex_32_Collection_Framework_DSA.List;

import java.util.Stack;

public class Lab252_Stack {
    public static void main(String[] args) {
        //Stack
        //Last In- First Out

       // Stack s=new Stack();
       // s.add("pramod");
       // s.add("dutta");
       // System.out.println(s);

        Stack s=new Stack();
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.empty());
        System.out.println(s.add("snehal"));
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);
    }
}
