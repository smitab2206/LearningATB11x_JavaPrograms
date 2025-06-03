package Ex_32_Collection_Framework_DSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab260_ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> deck=new ArrayDeque<>();
        deck.push(15);//  push(E e):
        //Inserts the element at the front (head) of the deque.
        //Equivalent to addFirst(e).
        //Often used when treating the deque like a stack (LIFO).
        deck.push(10);
        deck.add(20);// Inserts the element at the end (tail) of the deque.
        //Equivalent to addLast(e).
        // Often used when treating the deque like a queue (FIFO).
        deck.push(30);
        deck.add(2);
        System.out.println(deck);
    }
}
