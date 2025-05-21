package Ex_27_Static;

public class Lab208_REAL {
    public static void main(String[] args) {
        System.out.println(ATB.courseName);
        System.out.println(ATB.mentorName);
        ATB.doAssignment();
        ATB.joinZoomCall();

        ATB amit=new ATB();
        amit.payFees();
        amit.setName("amit Raje");
        amit.getName();
        amit.setPhone("9876654322");
        amit.getPhone();

    }
}
class ATB{
    static {
        System.out.println("Load the class?, I will execute");
    }

    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }

    private String name;
    private String phone;
    static String courseName="ATB_11x";
    static String mentorName="Pramod";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    static void doAssignment(){
        System.out.println("Do Assignment!!");
    }

    static void joinZoomCall(){
        System.out.println("Join Zoom call!!");
    }

    void payFees(){
        System.out.println("Pay the fees..");
    }
}
