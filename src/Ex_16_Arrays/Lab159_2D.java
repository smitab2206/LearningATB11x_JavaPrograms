package Ex_16_Arrays;

public class Lab159_2D {
    public static void main(String[] args) {
        // 1,2,3
        // 4,5,6
        // 7,8,9

        int [][] array_2D_old={{1,2,3},{4,5,6},{7,8,9}};
        int[][] prdefined={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] array;
        array=new int[][] {{1,2,3},{4,5,6},{7,8,9}};

        // R ->  3
        // C -> 3
        int[][] array_2D=new int[3][3];
        array_2D[0][0]=1;
        array_2D[0][1]=2;
        array_2D[0][2]=3;
        //array_2D[0][3]=92; //error- Index 3 out of bounds for length 3

        array_2D[1][0]=4;
        array_2D[1][1]=5;
        array_2D[1][2]=6;

        array_2D[2][0]=7;
        array_2D[2][1]=8;
        //array_2D[2][2]=9;
        System.out.println(array_2D[2][0]);
        System.out.println(array_2D[2][2]);
        // 1 0,0
        //2	0,1
        //3	0,2
        //
        //4	1,0
        //5	1,1
        //6	1,2
        //
        //7	2,0
        //8	2,1
        //9	2,2

    }
}
