package Ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab249_NestedArrayList {
    public static void main(String[] args) {
        List fruits1=new ArrayList();
        fruits1.add("Orange");
        fruits1.add("Papaya");
        fruits1.add("Apple");
        System.out.println(fruits1);

        List fruits2=new ArrayList();
        fruits2.add("Orange");
        fruits2.add("Mango");
        fruits2.add("Banana");
        fruits2.add(("Guava"));
        System.out.println(fruits2);

        List vegetables=new ArrayList();
        vegetables.add("Cabbage");
        vegetables.add("Methi");
        vegetables.add("LadyFinger");
        System.out.println(vegetables);

        List all_fruits_veggies=new ArrayList();
        all_fruits_veggies.add(fruits1);
        all_fruits_veggies.add(fruits2);
        all_fruits_veggies.add(vegetables);
        System.out.println(all_fruits_veggies);
        System.out.println(all_fruits_veggies.get(2));

    }
}
