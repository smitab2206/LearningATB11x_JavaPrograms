package Ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%
        String s0 = "Pramod";
        String s1 = new String("Pramod");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        //where the values are stored, i.e location reference is different
        System.out.println(s0);//SCP
        System.out.println(s1);//Object Area(OA)
        System.out.println(stringBuffer);//OA
        System.out.println(stringBuilder);//OA

    }
}
