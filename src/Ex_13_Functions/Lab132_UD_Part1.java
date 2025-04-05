package Ex_13_Functions;

public class Lab132_UD_Part1 {

    public static void main(String[] args) {
        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        // 1.Without Parameters and Without Return Type
        wp_wr_greet();

        // 2.Without Parameters but With Return Type
        String return_String=greet_wp_with_RT();
        System.out.println(return_String);

        // 3.With Parameters and Without Return Type
        greet_with_Full_name("Smita","Sontakke");
        greet_with_details("Smita",32,100);

        // 4. With Parameters and With Return Type
        int sum_of_2nos=sum_of_two_numbers(1,3);
        System.out.println(sum_of_2nos);
        int sum_of_3nos=sum_of_three_numbers(10,20,30);
        System.out.println(sum_of_3nos);
    }

    // 1.Without Parameters and Without Return Type
    static void wp_wr_greet(){
        System.out.println("Hi, Good Morning");
    }

    // 2.Without Parameters but With Return Type
    static String greet_wp_with_RT() {
        System.out.println("hii");
        return "How r u?";
    }

    // 3.With Parameters and Without Return Type
    static void greet_with_Full_name(String FN,String LN){
        System.out.println("Full name is "+FN+" "+LN);
    }

    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is ->" + name + "\nYour age is " + age + "\nYour salary is " + salary);
    }


    // 4. With Parameters and With Return Type
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }
    static int sum_of_three_numbers(int a, int b,int c){
        return a+b+c;
    }
}
