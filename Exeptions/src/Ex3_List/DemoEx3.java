package Ex3_List;

/**
 * Created by clouway on 15.04.16.
 */
public class DemoEx3 {
  public static void main(String[] args) {
    List l1 = new List(5);
    l1.add("sasa");
    l1.add("123");
    l1.add("EWQEW");
    l1.add("124");
    l1.add("126");
    System.out.println(l1.printAllElements());
    l1.remove("EWQEW");
    System.out.println(l1.printAllElements());


  }
}
