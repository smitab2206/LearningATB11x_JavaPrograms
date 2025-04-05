package Ex_10_For_Loop;

public class Lab113_ForLoop_Continue_Even_Numbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 50 ; i++) { // 0 to 50, 51 Times
            if(i%2 ==0){
                System.out.println("Even -> "+i);
                continue;
            }
            System.out.println("Odd -> "+i);
        }
    }
}
