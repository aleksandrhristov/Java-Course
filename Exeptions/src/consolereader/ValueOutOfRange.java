package consolereader;

/**
 * Created by clouway on 15.04.16.
 */
public class ValueOutOfRange extends Exception {
  public ValueOutOfRange(int min, int max) {
    super("The value must be > " + min + " and < " + max + ".");
  }
}
