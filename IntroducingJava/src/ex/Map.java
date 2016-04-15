package ex;

/**
 * Created by clouway on 04.04.16.
 */
public class Map {
    /**
     * Method for finding the GCD of two prime numbers.
     * @param a
     * @param b
     * @return
     */
    public int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        while(b != 0){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        return a;
    }

    /**
     * Method for finding the LCM of two prime numbers.
     * @param a
     * @param b
     * @return
     */
    public int lcm(int a, int b){
        return a * (b / gcd(a, b));
    }
}
