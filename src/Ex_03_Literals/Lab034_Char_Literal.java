package Ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1='A';//A to Z, a-z, !!@#$%^&*()_+
        //char c2="A";// this is not char, it is String
        char c2='B';
        char c3='@';
        char c4='_';
        char c5='9';
        char c6='1';
        char c7='(';
        char c8=' ';

        //Escape character
        char new_line= '\n';
        char tab_line= '\t';
        char back_space= '\b';
        char carriage_return= '\r';

        System.out.println("Smita"+new_line+" Sontakke");
        System.out.println("Smita"+tab_line+" Sontakke");
        System.out.println("Smita"+back_space+" Sontakke");
        System.out.println("Smita"+carriage_return+" Sontakke");

        System.out.println("Hi, this is first line"+new_line+"This is second line \n This is third line");

        char c10='A';
        //  // ASCII, (limited numbers) - A -> 65
        char ruppes = '₹';
        System.out.println(ruppes);
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';
    }
}
