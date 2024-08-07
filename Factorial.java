
import java.util.Scanner;

/**
 * Factorial
 */
public class Factorial {
    public static void main(String[] args) {
        
    
    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();

    int fact=1;

    for(int i=2;i<=num;i++){
        fact*=i;
    }

    System.out.println(fact);
}
}