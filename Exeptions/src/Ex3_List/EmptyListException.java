package Ex3_List;

/**
 * Created by clouway on 15.04.16.
 */
public class EmptyListException extends Exception{
  public EmptyListException(){
    super("List is empty.");
  }
}
