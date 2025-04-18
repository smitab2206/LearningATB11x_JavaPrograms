package Tasks;

public class Task_2nd_Largest_num_in_array {
    public static void main(String[] args) {
        int[] array={1,2,3,4,6,5,10,8,15,21};

        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max=array[i];
            }
        }
        System.out.println("biggest num is "+max);

        int SecondMax=array[0];
        for (int i = 0; i < array.length; i++) {
            if (SecondMax < array[i] && array[i]!=max) {
                SecondMax=array[i];
            }
        }
        System.out.println("Second maximum number in an array is "+SecondMax);
    }
}
