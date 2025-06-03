package Ex_32_Collection_Framework_DSA.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab259_LinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();// instantiating a LinkedList object and assigning it to a Queue reference.
        queue.add(6);
        queue.add(1);
        queue.add(8);
        queue.add(1);

        Iterator<Integer> iterator= queue.iterator();
        while (iterator.hasNext()){
            Integer value= iterator.next();
            System.out.println(value);
        }

    }
}
