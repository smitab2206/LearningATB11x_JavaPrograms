package Ex_06_TernaryOperator;

public class Lab068_real_Age_Classification {
    public static void main(String[] args) {
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
        // take an input from user

        String age= args[0];
        System.out.println(age);
        System.out.println(age instanceof String);

        int age1=Integer.parseInt(age);//type coversion. We want to convert String to integer
        String result=(age1<18)? "Minor" : (age1<65) ? "Adult" : "Senior Citizen";
        System.out.println(result);
    }
}
