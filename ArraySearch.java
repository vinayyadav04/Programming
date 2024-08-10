import java.util.*;
public class ArraySearch {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter element");
        int num=scn.nextInt();
        boolean flag=false;
        System.out.println("enter size");
        int size=scn.nextInt();

        int [] a=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        System.out.println("all elements");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        for(int j=0;j<a.length;j++){
            if(num==a[j]){
                    flag=true;
                break;
            }
        }
        if(flag==true)
        System.out.println("found");
        else
        System.out.println("not found");
        
    }
}
