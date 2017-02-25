
public class DuplicateValueException extends Exception {
    /*
    returns an error message when duplicate value is found in a map
    */
    
    public DuplicateValueException() {
        super("Error: The  map you are trying to swap has duplicate values.");
    }
}
