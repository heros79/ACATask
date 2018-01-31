package david;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by David on 1/31/2018.
 */
public class Task1_5P4 {

    public String correctWord (String word) {
        if (RegEx(word))
            return "TRUE";
        else
            return "FALSE";
    }

    private boolean RegEx(String word) {
        //Pattern pattern = Pattern.compile("(^[A-Z]+$)|(^[A-Z][a-z]+$)");
        Pattern pattern = Pattern.compile("^[A-Z]([A-Z]*|[a-z]*)$");
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();
    }
}
