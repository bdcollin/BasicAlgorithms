
class BinaryNode {

    BinaryNode left, right; //each binary node has a left and right node
    int data;
    
    //default constructor
    public BinaryNode() {
        left = null;
        right = null;
        data = 0;           
    }
    
    //constructor passed with data
    public BinaryNode(int n) {
        left = null;
        right = null;
        data = n;           
    }
    
}
