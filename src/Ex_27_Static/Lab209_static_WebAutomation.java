package Ex_27_Static;

public class Lab209_static_WebAutomation {
    public static void main(String[] args) {
        System.out.println(Automation.driver);

        Automation t1=new Automation();
        System.out.println(t1.driver);
    }
}

class Automation{
    static String driver="Chrome";
}
