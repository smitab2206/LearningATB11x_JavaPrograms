package Ex_32_Collection_Framework_DSA.List;

public class Student {
    private String name;
    private String rollno;

    public Student(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void printdetails(){
        System.out.println("Student name: "+this.name);
        System.out.println("Student roll no: "+this.rollno);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno='" + rollno + '\'' +
                '}';
    }
}


