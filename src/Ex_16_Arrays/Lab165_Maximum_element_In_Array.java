package Ex_16_Arrays;

public class Lab165_Maximum_element_In_Array {
    public static void main(String[] args) {
        int[] array1={1,2,8,4,5,10};
        int max=array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]){
                max=array1[i];
            }
        }
        System.out.println("Maximum element in an array is : "+max);
    }
}
