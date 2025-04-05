package Ex_13_Functions;

public class LAb133_InterviewQ {
    public static void main(String[] args) {
        main(3.14f);

        main("hi");

        int result=main(50);
        System.out.println(result);

        main(false);
    }

    public static void main(String args) {
        System.out.println("Hw r u?");
    }

    public static int main(int args) {
        return 10;
    }

    public static int main(float args) {
        return 10;
    }

    public static boolean main(boolean args) {
        return true;
    }
}
