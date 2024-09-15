import java.util.Scanner;


public class StringPalindrome{
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        String s=scn.next();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}
