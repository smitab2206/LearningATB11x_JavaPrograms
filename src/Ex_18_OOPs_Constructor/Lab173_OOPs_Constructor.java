package Ex_18_OOPs_Constructor;

public class Lab173_OOPs_Constructor {
    public static void main(String[] args) {
        Baby b1=new Baby();
        new Baby();
        Baby b2;
    }
}

class Baby{
    // Attribute | Instance Variable |  Member variables, data members
    String name;

    // Behaviour
    void cry(){
        System.out.println("Cry!!");
    }

    void sleep(){
        System.out.println("Cry!!");
    }

    void eat(){
        System.out.println("Eat!!");
    }

    //Default constructor
    Baby(){
        System.out.println("I am called, Default constructor!");
        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)
    }
}
