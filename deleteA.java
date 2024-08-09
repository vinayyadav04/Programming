import java.util.*;
/**
 * deleteA
 */
public class deleteA {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        
        System.out.println("enter index:");
        int index=scn.nextInt();
        
        
        System.out.println("enter array size:");
        int size=scn.nextInt();
        
        System.out.println("enter array elements");
        int [] a=new int [size];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }



        if(index>=0 && index<a.length){
        for(int i=index;i<a.length-1;i++){
            a[i]=a[i+1];
        }

        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }else{
        System.out.println("invalid index");
    }

       

    }
}