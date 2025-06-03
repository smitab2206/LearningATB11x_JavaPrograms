package Ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab242_Arraylist {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("pramod");
        arrayList.add(null);
        arrayList.add("dutta");
        arrayList.add("dutta");//duplicates are allowed
        arrayList.add(123);//different data type is also allowed
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l=new ArrayList();//dynamic dispatch
        l.add(123);
        l.add("Smita");
        System.out.println(l);
        System.out.println(l.isEmpty());

        List l2=new ArrayList();
        System.out.println(l2.isEmpty());
    }
}
