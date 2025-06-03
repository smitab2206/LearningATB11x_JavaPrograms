package Ex_32_Collection_Framework_DSA.List;

import java.util.ListIterator;
import java.util.Vector;

public class Lab248_Vector_ListIterator {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.add("item1");
        v.add("item2");
        v.add("item3");
        v.add("item4");
        v.add("item5");

        ListIterator listIterator= v.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println( " -- ");

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
