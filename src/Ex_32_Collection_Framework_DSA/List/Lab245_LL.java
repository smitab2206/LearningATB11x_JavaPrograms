package Ex_32_Collection_Framework_DSA.List;

import java.util.Scanner;

public class Lab245_LL {
    public static void main(String[] args) {
  /*      LinkedList<String> animals=new LinkedList();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Elephant");
        System.out.println("LinkedList: "+animals);

        //Accessing Elements
        System.out.println("First Element: "+animals.getFirst());
        System.out.println("Last Element: "+animals.getLast());

        //Removing Elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removal:" +animals);
        System.out.println("size of LinkedList: "+animals.size());
*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: " );
        int n1=sc.nextInt();
        System.out.println("Enter number 2: " );
        int n2=sc.nextInt();

        System.out.println("Addition: "+(n1+n2));
        System.out.println("Subtracton: " +(n1-n2));
        System.out.println("Multiplication: "+(n1*n2));
        System.out.println(("Division: "+(n1/n2)));

    }
}
