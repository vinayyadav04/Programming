
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}




public class Trees {
    static Scanner scn = new Scanner(System.in);  // Scanner to take input

    // Method to create the tree
    public static Node create() {
        System.out.println("Do you want to create a node? (1 for Yes, 2 for No)");
        int choice = scn.nextInt();
        if (choice == 2) {
            return null;
        }
        
        // Create a new node
        System.out.println("Enter data for the node:");
        int ele = scn.nextInt();
        Node newNode = new Node(ele);

        // Recursively create left and right subtrees
        System.out.println("Creating left child of " + ele);
        newNode.left = create();

        System.out.println("Creating right child of " + ele);
        newNode.right = create();

        return newNode;
    }