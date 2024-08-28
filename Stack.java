import java.util.Scanner;

public class Stack {
    static int top = -1;
    static int size;
    static int[] stack;
    static Scanner scn = new Scanner(System.in);
    
    public static void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            stack[top] = data;
            System.out.println("Data pushed: " + data);
        }
    }
    
    public static void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Data popped: " + stack[top]);
            top--;
        }
    }
    
    public static boolean isEmpty() {
        return top == -1;
    }
    
    public static boolean isFull() {
        return top == size - 1;
    }
    
    public static void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter choice: 1. Creation \n2. Push \n3. Pop \n4. Display \n5. isEmpty \n6. isFull \n7. Exit");
            
            int choice = scn.nextInt();
    
            switch (choice) {
                case 1:
                    if (stack == null) {
                        System.out.println("Enter stack size:");
                        size = scn.nextInt();
                        stack = new int[size];
                    } else {
                        System.out.println("Stack is already created");
                    }
                    break;
                case 2:
                    if (stack == null) {
                        System.out.println("Create stack first");
                    } else {
                        System.out.println("Enter data:");
                        int data = scn.nextInt();
                        push(data);
                    }
                    break;
                case 3:
                    if (stack == null) {
                        System.out.println("Create stack first");
                    } else {
                        pop();
                    }
                    break;
                case 4:
                    if (stack == null) {
                        System.out.println("Create stack first");
                    } else {
                        display();
                    }
                    break;
                case 5:
                    if (stack == null) {
                        System.out.println("Create stack first");
                    } else {
                        System.out.println("Is stack empty? " + isEmpty());
                    }
                    break;
                case 6:
                    if (stack == null) {
                        System.out.println("Create stack first");
                    } else {
                        System.out.println("Is stack full? " + isFull());
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scn.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
}

//local variable so they are stored in stack
//static variable class area
//non-static variable heap area

//Stack implimentation
//1.Stack using Array
//2.Stack using LinkedList

//Operation
//push:to insert the data in stack
//pop: to remove the data from stack
//peek:used to display the top most element
//isEmpty():used to check whether stack is empty or not 
//isFull():used to check whether stack is full or not
//Display():it will display all element in stack

//top : top is a variable used for traversing


//Stack using array
// step1 enter stack size
// step2 