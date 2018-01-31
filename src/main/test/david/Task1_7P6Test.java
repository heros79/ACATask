package david;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by David on 1/31/2018.
 */
public class Task1_7P6Test {


    @Test
    public void findNumberInArrayTest() {

        int array[] = {2, 3, 4, 6, 8, 10, 65, 100, 110,754, 755};
        int correctNumber = 6;
        int incorrectNumber = 113;

        Task1_7P6 task1_7P6 = new Task1_7P6();

        assertEquals(task1_7P6.findNumberInArray(array, correctNumber), "Yes");
        assertEquals(task1_7P6.findNumberInArray(array, incorrectNumber), "No");

    }
}
