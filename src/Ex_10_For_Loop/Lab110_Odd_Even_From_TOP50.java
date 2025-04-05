package Ex_10_For_Loop;

public class Lab110_Odd_Even_From_TOP50 {
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; i++) {
            if(i%2==0){
                System.out.println(i+" = Even");
            }else {
                System.out.println(i+" = Odd");
            }
        }
    }
}
