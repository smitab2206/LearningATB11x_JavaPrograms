package Ex_16_Arrays;

import java.util.Scanner;

public class Lab163_Right_Angled_Triangle {
    public static void main(String[] args) {
      // How the pattern we want
        //  n = 3
        // *
        // **
        // ***

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number e,g n=3");
        int n=scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
