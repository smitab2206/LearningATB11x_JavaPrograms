package Ex_32_Collection_Framework_DSA.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab257_Comparator {
    public static void main(String[] args) {
        Student1 s1=new Student1(107,"smita",30);
        Student1 s2=new Student1(102,"Priya",20);
        Student1 s3=new Student1(103,"nisha",40);

        List<Student1> student1List=new ArrayList<>();
        student1List.add(s1);
        student1List.add(s2);
        student1List.add(s3);

        System.out.println(student1List);

        //syntax:Collections.sort(List,Comparator)
        Collections.sort(student1List,new RollNoComparator());//RollNo based sorting
        System.out.println(student1List);


        Collections.sort(student1List,new NameComparator());////name based sorting
        System.out.println(student1List);
        //because  in Unicode:
        //'P' (uppercase) = 80
        //'n' = 110
        //'s' = 115
        //NameComparator nm=new NameComparator();
        //System.out.println(nm.compare(s1,s2));

        Collections.sort(student1List,new AgeComparator());//Age based sorting
        System.out.println(student1List);

    }

}

class Student1{
    private int rollNo;
    private String name;
    private int age;
    // Constructor, getters, setters, toString
    public Student1(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
class RollNoComparator implements Comparator<Student1>{
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getRollNo()- o2.getRollNo();
    }
}

class NameComparator implements Comparator<Student1>{
    @Override
    public int compare(Student1 o1, Student1 o2) {
        //return o1.getName().compareTo(o2.getName());//in case 'P','n','s' looke at the case
        return o1.getName().compareToIgnoreCase(o2.getName());//o/p==> 'n','P','s'
    }
}

class AgeComparator implements Comparator<Student1>{
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getAge()- o2.getAge();
    }
}