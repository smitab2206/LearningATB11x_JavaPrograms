package Ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;


public class Lab241_List {
    public static void main(String[] args) {
       // List fruits=new List();
        List fruits=List.of("orange","apple","banana","mango","watermelon");
        System.out.println(fruits);
        //fruits.add("chiku");//java.lang.UnsupportedOperationException
        //fruits.remove("apple");//Not possible
        //System.out.println(fruits);

        List l=new ArrayList();//Dynamic dispatch
        ArrayList l2=new ArrayList();
        l.add("Hello");
        l.add(123);
        l.add(true);
        l.add("Blah Blah");
        System.out.println(l);
        l.remove("Blah Blah");
        System.out.println(l);

        l2.add("456");
        l2.add("prisha");
        l2.add(222);
        System.out.println(l2);
        l2.remove("456");
        System.out.println(l2);

    }
}
