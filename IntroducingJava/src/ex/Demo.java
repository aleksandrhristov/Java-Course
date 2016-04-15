package ex;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by clouway on 04.04.16.
 */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for the first number. ");
        int n1 = sc.nextInt();
        System.out.print("Enter value for the second number. ");
        int n2 = sc.nextInt();

        int arr1[] = {34,4,67,3,9};

        Map m1 = new Map();
        System.out.println();
        System.out.println("1. The GCD of " + n1 + " and " + n2 + " is " + m1.gcd(n1, n2) + ".");
        System.out.println("2. The LCM of " + n1 + " and " + n2 + " is " + m1.lcm(n1, n2) + ".");

        Array arr = new  Array(arr1);
        System.out.println("3. Manipulating arrays.");
        System.out.println("a) Array minimum value is: " + arr.getMinElement());
        System.out.println("b) Sum of the array is: " + arr.getSum());

        System.out.println("c) Printing an array: " + arr.printArray());
        arr.sort();
        System.out.println("4. QuickSort: " + arr.printArray());
        arr.reverseArray();
        System.out.println("5. Reversing an array: " + arr.printArray());

        System.out.println("7. Generating a random string with assigned length.");
        System.out.print("Enter the lenght of the string. ");
        int len = sc.nextInt();
        String str = "";
        Strings randStr1 = new Strings(len, str);
        System.out.println("    " + randStr1.GenerateString());
    }
}
