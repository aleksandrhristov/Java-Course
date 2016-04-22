package ex;

import java.util.Random;

/**
 * Created by clouway on 04.04.16.
 */
public class Strings {
    private int len;
    private String str;

    public Strings(int len, String str) {
        this.len = len;
        this.str = str;
    }

    /**
     * Generating a random string with an assigned length.
     * @return
     */
    public String GenerateString() {
        Random rn = new Random();
        char c[] = new char[len];
        for(int i = 0; i<len; i++){
            c[i] = (char)(rn.nextInt(26) + 'a');

        }
        str = String.valueOf(c);
        return str;
    }
}