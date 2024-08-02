//Trick  Whenever we find factors of a number we should iterate only for number which are less than number/2 since all the factors exist in that range


import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        System.out.print(1+",");

        for(int i=2;i<num/2;i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }
        System.out.println(num);
    }
}
