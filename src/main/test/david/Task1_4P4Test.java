package david;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by David on 1/30/2018.
 */
public class Task1_4P4Test {

    @Test
    public void changeStringTest() {
        String a = "ACA is awesome!";
        String b = "ACA si !emosewa";

        Task1_4P4 task1_4P4 = new Task1_4P4();

        assertEquals(task1_4P4.changeString(a), b);
    }

}
