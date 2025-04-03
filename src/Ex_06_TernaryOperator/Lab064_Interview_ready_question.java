package Ex_06_TernaryOperator;

public class Lab064_Interview_ready_question {
    public static void main(String[] args) {
        //Nested Ternary
        //result=condition1 ? expression1 : (condition2 ? expression2 : expression3)

        int number=25;
        String result= (number > 10) ? (number > 20 ?"N>20":"N<20"):"B";
        System.out.println(result);
    }
}
