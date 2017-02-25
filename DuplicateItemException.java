public class DuplicateItemException extends Exception {
    /*
    returns an error message when duplicate node is found
    */
    
    public DuplicateItemException(int n) {
        super("Error: You cannot insert " + n + " because that item is already in the Binary Search Tree.");
    }
}