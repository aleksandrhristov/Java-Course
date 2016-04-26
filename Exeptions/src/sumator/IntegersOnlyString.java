package sumator;

public class IntegersOnlyString extends Exception {
  public IntegersOnlyString() {
    super("The value must be an Integer.");
  }
}
