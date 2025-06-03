package Ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab246_LL_P2 {
    public static void main(String[] args) {
        List myList=new ArrayList(5);
        List myList1=new ArrayList();

        List mylist2=new LinkedList();

        mylist2.add("Pramod");
        mylist2.add("Dutta");
        mylist2.add("Amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.add("smita"));
        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.contains("smita"));
        System.out.println(mylist2.size());
        System.out.println(mylist2.remove("smita"));
        System.out.println(mylist2);
        System.out.println(mylist2.reversed());
    }


}
