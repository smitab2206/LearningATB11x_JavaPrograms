package Ex_22_OOPs_accessModifier;

public class Lab192 {

}
class Father{
    private int gold=10;
    protected int bhk3=1;
    int car=1;
    public int TV=1;
}

class son extends Father{
    void getGold(){
        //System.out.println(gold);//private
        System.out.println(bhk3);
        System.out.println(car);
        System.out.println(TV);
    }
}
