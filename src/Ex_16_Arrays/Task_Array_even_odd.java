package Ex_16_Arrays;

public class Task_Array_even_odd {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};

        int even=0;
        int odd=0;

        System.out.println("Even Numbers :");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Odd Numbers :");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Count of even numbers="+even+" and Count of Odd numbers="+odd);

        /*
        int[] numbers = {1, 2, 3, 4};

        System.out.print("Even Numbers: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.print("\nOdd Numbers: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    */
    }
}
