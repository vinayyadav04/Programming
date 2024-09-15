
import java.util.Scanner;

public class GCDHCF {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        scn.close();

        int largest=num1>num2?num1:num2;

        int hcf=1;

        for(int i=largest/2;i>2;i--){
            if(num1%i==0 && num2%i==0){
                hcf=i;
                System.out.println(hcf);
                break;
            }

        }
    }
}
