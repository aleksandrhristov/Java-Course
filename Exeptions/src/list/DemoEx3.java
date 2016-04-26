package list;

/**
 * Created by clouway on 15.04.16.
 */
public class DemoEx3 {
  public static void main(String[] args) {
    List l1 = new List(7);
    l1.add("sasa");
    l1.add("123");
    l1.add("EWQEW");
    l1.add("124");
    l1.add("126");
    l1.add("OBJJJJJJ");
    l1.add("xD");
    System.out.println(l1.printAllElements());
    l1.remove("EWQEW");
    System.out.println(l1.printAllElements());


  }
}
