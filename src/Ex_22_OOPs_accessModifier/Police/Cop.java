package Ex_22_OOPs_accessModifier.Police;

public class Cop {
    private int gun;
    String iCard;
    public String phone_no;//can be accessed outside the package by other classes also

    //Parameterised constructor
    public Cop(int bullet){
        this.gun=bullet;
    }

    //method/behaviour
    protected void canIshoot(){
        System.out.println("Yes u can shoot!!");
    }
}
