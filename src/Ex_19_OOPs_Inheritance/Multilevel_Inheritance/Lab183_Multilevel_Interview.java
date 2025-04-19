package Ex_19_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab183_Multilevel_Interview {
    public static void main(String[] args) {

        //Son s1=new Grandfather();// meaning- whether son was present when Grandfather was getting born?? - ans No.
        //Son s1=new Father();// similarly, this is also not Possible
        Son amit=new Son();// this is possible
        //Father f1=new Grandfather();//not possible

        Grandfather g1=new Son();//Dynamic Dispatch- We can only call common functions e.g home()
        //Rule: You can create a Son class Object with the Father or GrandFather Reference.
        //Only same name functions or behaviour are allowed to call by using the gf, f reference.
        Grandfather g2=new Father();
        g1.gf();//with g1 reference, u cannot call s() function
        g1.home();//Son's home

        Father f1=new Son();
        f1.home();//Son's home

        g2.home();//Fathers home

        //This concept is used in case of selenium
        //WebDriver driver=new ChromeDriver();

    }
}
