package Ex_22_OOPs_accessModifier.Police;

public class JrCop2 {
    public static void main(String[] args) {
        Cop jrCop2=new Cop(10);
        jrCop2.canIshoot();
        //System.out.println(jrCop2.gun);//private
    }
}
