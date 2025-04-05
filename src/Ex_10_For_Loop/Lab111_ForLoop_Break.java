package Ex_10_For_Loop;

public class Lab111_ForLoop_Break {
    public static void main(String[] args) {
        // break - it is used to come out of the loop

        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
    }
}
