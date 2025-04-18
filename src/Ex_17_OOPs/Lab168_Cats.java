package Ex_17_OOPs;

public class Lab168_Cats {
    public static void main(String[] args) {
        cat c1=new cat();
        cat c2;
        new cat();

        c1.running();;
        //c2.running();//error

        new cat().running();
        System.out.println(new cat().name);
    }
}
class cat{
    String name; // null

    void running() {
        System.out.println("Running");
    }
}