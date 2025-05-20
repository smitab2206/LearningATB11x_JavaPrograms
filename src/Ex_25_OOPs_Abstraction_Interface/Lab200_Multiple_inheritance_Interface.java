package Ex_25_OOPs_Abstraction_Interface;

public class Lab200_Multiple_inheritance_Interface {
    public static void main(String[] args) {
        child c=new child();
        c.money();
    }
}

interface Mother{
    void money();
}

interface Father{
    void money();
}

class child implements Mother,Father{
    @Override
    public void money() {
        System.out.println("Child's money ");
    }
}
