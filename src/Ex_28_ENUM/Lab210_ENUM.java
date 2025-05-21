package Ex_28_ENUM;

public class Lab210_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.MON);
        System.out.println(Project_urls.google);
        //A a=new A();
        //System.out.println(a.days[4]);
    }

    //class A{
    //    String[] days={"Mon","Tue","Wed","Thur","Fri","Sat","Sun"};
    //}

    enum Day{
        SUN,MON,TUE,WED,THURS,FRI,SAT
    }

    enum Project_urls{
        google, restassured,katalon,vwo
    }
}
