
//check prime or not

import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
    
        
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int count =0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
            count++;
        }
        if(count>0){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}