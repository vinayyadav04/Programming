import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        String s=scn.next();

        int countVowel=0;
        int consonant=0;
        scn.close();

        for(int j=0;j<=s.length()-1;j++){
            switch (s.charAt(j)) {
                case 'a':countVowel++;
                    break;
                case 'e':countVowel++;
                    break;
                case 'i':countVowel++;
                    break;
                case 'o':countVowel++;
                    break;
                case 'u':countVowel++;
                    break;
                default:consonant++;
                    break;
            }

        }

        System.out.println(countVowel);
        System.out.println(consonant);

    }
}
