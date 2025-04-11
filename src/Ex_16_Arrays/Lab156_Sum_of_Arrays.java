package Ex_16_Arrays;

public class Lab156_Sum_of_Arrays {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {

            sum=sum+numbers[i];
        }
        System.out.println("Sum of Arrays "+sum);

        System.out.println("---------------");

        System.out.println("for Each....... ");
        sum=0;
        for (int n: numbers){
            sum=sum+n;
        }
        System.out.println("Sum is "+sum);
    }
}
