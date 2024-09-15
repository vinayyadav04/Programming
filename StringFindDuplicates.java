import java.util.Arrays;
import java.util.Scanner;

public class StringFindDuplicates {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        String s=scn.next();
        char[] ch=s.toCharArray();
        
        Arrays.sort(ch);
        
        for (int i = 0; i < ch.length; ) {
            int count = 1;

            
            while (i + 1 < ch.length && ch[i] == ch[i + 1]) {
                count++;
                i++;
            }

            if (count > 1) {
                System.out.println(ch[i] + ": " + count);
            }

            i++;  
        }
}
}