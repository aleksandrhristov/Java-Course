package consolereader;

import java.util.Scanner;

/**
 * Created by clouway on 15.04.16.
 */
public class DemoEx2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n < 0 || n > 100) {
      try {
        throw new ValueOutOfRange(0, 100);
      } catch (ValueOutOfRange e) {
        e.printStackTrace();
      }
    }
  }
}
