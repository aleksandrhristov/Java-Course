package Ex3_List;

/**
 * Created by clouway on 15.04.16.
 */
public class FullListException extends Exception {
  public FullListException() {
    super("The list is full. Can't add more elements.");
  }
}
