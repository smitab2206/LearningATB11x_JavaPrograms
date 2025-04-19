package Ex_19_OOPs_Inheritance.Hierarchical_Inheritance;

public class Lab185_Hierarchical {
    public static void main(String[] args) {
        Father father=new Father();
        father.home();

        Ruhani r1=new Ruhani();
        r1.ruhani_home();
        r1.home();

        Pramod p1=new Pramod();
        p1.home();
        p1.pramod_home();

        Lucky l1=new Lucky();
        l1.home();
        l1.lucky_home();
    }
}

class Father{
    void home(){
        System.out.println("Father- 2BHK");
    }
}

class Pramod extends Father{
    void pramod_home(){
        System.out.println("Pramod home");
    }
}

class Lucky extends Father{
    void lucky_home(){
        System.out.println("Lucky home");
    }
}

class Ruhani extends Father{
    void ruhani_home(){
        System.out.println("Ruhani Home");
    }
}
