package sumator;

import java.util.Scanner;

/**
 * Created by clouway on 15.04.16.
 */
public class DemoEx1 {
  public static void main(String[] args) {
    Sumator su = new Sumator();
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    String sum = su.stringSum(str1, str2);
    System.out.println(sum);
  }
}
