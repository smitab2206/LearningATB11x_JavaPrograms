package Ex_32_Collection_Framework_DSA.Queue;

import java.util.PriorityQueue;

public class Lab258_Queue {
    public static void main(String[] args) {
        //Note: Queue will not be much used in automation 0.0001%..
        PriorityQueue q=new PriorityQueue<>();
        q.add("Pramod");
        q.add("Dutta");
        System.out.println(q);
        //PQ==>Natural Sorting
        System.out.println(q.peek());//retrives head of the queue.. o/p==>Dutta
        System.out.println(q);//o/p==> [Dutta,Pramod]
        System.out.println(q.poll());//retrives and removes head of the queue.. o/p Dutta
        System.out.println(q);//o/p==> [Pramod].. Dutta(head) will be removed

    }
}
