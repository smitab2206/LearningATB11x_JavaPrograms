package Ex_32_Collection_Framework_DSA.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab254_SET_P1 {
    public static void main(String[] args) {
        Set hs=new HashSet();//Hashset==> most widely used. ( hashing mechanism to store the elements) -> hashcode.
        // -> random order of storing.No duplicates
        Set lhs=new LinkedHashSet();//It will keep the order how they are entered.

        Set ts=new TreeSet();// red and black tree to store the elements(. they are in the natural sorted order)

        hs.add("Pramod");
        hs.add("Pramod");
        hs.add("Dutta");
        hs.add("zyna");
        hs.add("arvind");
        System.out.println(hs);
    }
}
