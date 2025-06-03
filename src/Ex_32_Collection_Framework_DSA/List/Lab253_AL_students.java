package Ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab253_AL_students {
    public static void main(String[] args) {

        Student s1=new Student("Smita","100");
        Student s2=new Student("Prisha","101");
        Student s3=new Student("sneha","102");

        List<Student> myStudents=new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);
        s1.printdetails();
        s2.printdetails();
        s3.printdetails();

        s1.toString();
    }


}
