package david;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by David on 1/30/2018.
 */
public class Task1_4P4 {


    public String changeString(String str) {
        String array[];

        array = str.split(" ");

        String reverseString = array[0];

        for (int i = 1; i < array.length; i ++) {
            char b[];
            b = array[i].toCharArray();
            for (int j = 0; j < b.length / 2; j ++) {
                char temp = b[j];
                b[j] = b[b.length - 1 - j];
                b[b.length - 1 - j] = temp;
            }
            reverseString = reverseString.concat(" " + new String(b));
        }

        return reverseString;
    }
}
