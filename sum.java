

/**
 * sum
 */
//Sum of Elements in array


import java.util.Scanner;

public class sum {
    public static void main(String[] args) {             //1   //Time complexity                   SpaceComplexity
        Scanner scn = new Scanner(System.in);           // 1                                1
        System.out.println("enter size");             // 1                                
        int size = scn.nextInt();                       // 1                                1

        int[] a = new int[size];                        // 1                                n
        System.out.println("enter elements");         // 1
        for (int i = 0; i < a.length; i++) {            // n+1                              1
            a[i] = scn.nextInt();                       // n

        }
        int sum = 0;                                    // 1                                1
        for (int j = 0; j < a.length; j++) {            // n+1                              1
            sum += a[j];                                // n
        }
        System.out.println("sum=" + sum);               // 1
    }
}                                                       //10+4n ->O(n)                     5+n->O(n)
                                                       // ignore constant and take higher order 