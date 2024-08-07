
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        //take 2 inputs
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        //finding the larger number
        int max=num1>num2?num1:num2;

        while (true) {
            if(max%num1==0 && max%num2==0){
            System.out.println(max);
            break;
            }
            
        }
        max++;
    }
}
