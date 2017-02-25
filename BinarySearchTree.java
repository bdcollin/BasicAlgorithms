
/* 
Blair Gentry

This program creates a Binary Search Tree and tests the BST,
printing out elements as they are traversed.
 */
class BinarySearchTree {

    private static BinaryNode root;

    //constructor method
    public BinarySearchTree() {
        root = null;
    }

    //constructor method that sets passed node as root
    public BinarySearchTree(BinaryNode r) {
        root = r;
    }

    //passes data to the insertNode method to be processed
    public void insertNode(int n) throws DuplicateItemException {
        root = insertNode(root, n);
    }

    //recursively inserts node into Binary Search Tree
    public BinaryNode insertNode(BinaryNode node, int n) throws DuplicateItemException {

        if (node != null) {
            int compare = n - node.data; //gives a value of negative, positive, or zero result to compare to current node
            if (compare < 0) { //when new data is less than current node, recurse the left node
                node.left = insertNode(node.left, n);
            } else if (compare > 0) { //when new data is less than current node, recurse the right node
                node.right = insertNode(node.right, n);
            } else { //when new data and node data are the same value, compare is zero, and node cannot be inserted into BST
                throw new DuplicateItemException(n);
            }
            return node;
        } else {
            node = new BinaryNode(n); //if node is null, create new BST root
        }
        return node;
    }

    //traverses BST in pre-order (Root, Left, Right) and prints result
    private void preOrder(BinaryNode node) {
        if (node != null) {
            System.out.println(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    //traverses BST in-order (Left, Root, Right) and prints result
    private void inOrder(BinaryNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.data + " ");
            inOrder(node.right);
        }
    }

    //main method that runs and displays a test of the BinarySearchTree class
    public static void main(String[] args) throws DuplicateItemException {
        //create new BST to test and insert nodes
        BinarySearchTree test = new BinarySearchTree();
        test.insertNode(50);
        test.insertNode(25);
        test.insertNode(15);
        test.insertNode(30);
        test.insertNode(75);
        test.insertNode(85);

        //display results
        System.out.println("Root: " + root.data); //print root of BST
        System.out.println("\nPreOrder Traversal: "); //pre-order traversal
        test.preOrder(root);
        System.out.println("\nInOrder Traversal: "); //in-order traversal
        test.inOrder(root);
    }
}
