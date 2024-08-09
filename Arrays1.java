import java.util.Scanner;
public class Arrays1 {
    public static void main(String[] args) {                
        Scanner scn=new Scanner(System.in);                 //1                     1
        System.out.println("Enter size of array");          //1                     
        int size=scn.nextInt();                             //1                     1   

        int[] a=new int[size];                              //1                     n

        System.out.println("enter array element");        //1

        for(int i=0;i<a.length;i++){                        //n                   1
            a[i]=scn.nextInt();                             //n
            
        }
        System.out.println("Array elements are");           //1
        for(int i=0;i<a.length;i++){                           //n                  1
            System.out.println(a[i]);                       //n
        }

    }                                                       //4n+9->O(n)        4+n->O(n)
}
