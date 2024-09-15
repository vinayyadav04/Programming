

import java.util.Scanner;

public class PrintPrimeElements {
    
    static class Node {
        int data;
        Node next;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Node head = null, tail = null;
        boolean flag = true;

        
        while (flag) {
            Node n = new Node();
            System.out.println("Enter data:");
            n.data = s.nextInt();

            if (head == null) {
                head = n;
                tail = n;
            } else {
                tail.next = n;
                tail = n;
            }

            System.out.println("Do you want to create another node? \n1)Yes\n2)No");
            int ch = s.nextInt();
            if (ch != 1) {
                flag = false;
            }
        }

       
        System.out.println("Prime elements in the list:");
        Node temp = head;
        while (temp != null) {
            if (isPrime(temp.data)) {
                System.out.print(temp.data + " ");
            }
            temp = temp.next;
        }
    }

    
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
    
        return true;
    }

    
}
