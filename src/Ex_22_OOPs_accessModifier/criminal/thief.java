package Ex_22_OOPs_accessModifier.criminal;

import Ex_22_OOPs_accessModifier.Police.Cop;

public class thief {
    public static void main(String[] args) {
        Cop thief=new Cop(100);

        //thief.canIshoot();//protected
        //thief.iCard;//since it is not public, cannot access
        System.out.println(thief.phone_no);
        //System.out.println(thief.gun);//private

    }

}
