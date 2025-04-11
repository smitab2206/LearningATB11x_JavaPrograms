package Ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Pramod");// Pramod is created in OA
        stringBuffer.append("Dutta");//Dutta is appended, Ony Pramod String is deleted now
        System.out.println(stringBuffer);//PramodDutta will be the only string in OA. As STringBuffer is mutable in Nature
        System.out.println(stringBuffer.reverse());

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);

    }
}
