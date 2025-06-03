package Ex_32_Collection_Framework_DSA.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab256_Comparable {
    public static void main(String[] args) {
       Student s1=new Student(107,"smita",30);
       Student s2=new Student(102,"Priya",20);
       Student s3=new Student(103,"nisha",40);

        List<Student> studentList=new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        System.out.println(studentList);
        Collections.sort(studentList);//syntax:Collections.sort(List)
        System.out.println(studentList);

        System.out.println(s1.toString());

        System.out.println(s1.compareTo(s2));//output==> 35 why? expained below==>
        // Why s1.compareTo(s2) Returns 35
        //Let's break it down:
        //s1.name = "smita"
        //s2.name = "Priya"
        //Now compare "smita".compareTo("Priya"):
        //The first characters are:
        //'s' (Unicode 115)
        //'P' (Unicode 80)
        //Difference: 115 - 80 = 35
        //So, "smita".compareTo("Priya") returns 35.

        //In case of roll no. o/p==>5
        //in case of age o/p==> 10
    }

    static class Student implements Comparable<Student>{
        private int rollNo;
        private String name;
        private int age;

        public Student(int rollNo, String name, int age) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollNo=" + rollNo +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            return this.name.compareTo(o.name);
        }

        /*
        public int compareTo(Student o) {
            return this.rollNo-o.rollNo;

        }*/
        /*
        public int compareTo(Student o) {
            return this.age-o.age;

        }*/

    }
}
