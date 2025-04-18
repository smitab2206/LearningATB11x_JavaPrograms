package Ex_16_Arrays;

public class Lab165_Left_Triangle_2D {
    public static void main(String[] args) {
     /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size :");
        int n=sc.nextInt();

        for (int i = 0; i < n ; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
     */  //OR
        int n = 3;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
