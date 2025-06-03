package Ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab243_ArrayList {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);//0
        list.add(2);//1
        list.add(3);//2
        list.add(4);//3
        list.add(true);//4
        list.add(3);//5

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));
        System.out.println(list.contains("1"));
        // Returns the index of the first occurrence of the specified element in this list,
        System.out.println(list.indexOf(3));
        System.out.println(list.lastIndexOf(3));

        System.out.println("-----------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        List list1=new ArrayList(4);//grow Automatically,
        list1.add(11);//0
        list1.add(12);//1
        list1.add(13);//2
        list1.add(14);//3
        list1.add(15);//4//grow Automatically,
        System.out.println(list1);
        System.out.println(list1.size());
    }
}
