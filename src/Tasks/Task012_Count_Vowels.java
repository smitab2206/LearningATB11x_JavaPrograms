package Tasks;

public class Task012_Count_Vowels {
    public static void main(String[] args) {
        String input="Java Program to Count Vowels and Consonants";
        int vowels=0;
        int consonants=0;

        for (int i = 0; i < input.length() ; i++) {
            char ch=input.charAt(i);
            if (ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'  ){
                vowels++;
            }else {
                consonants++;
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Consonants : "+consonants);

    }
}
