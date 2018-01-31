package david;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by David on 1/30/2018.
 */
public class Task1_3P3Test {



    @Test
    public void searchMinTest() {

        int array[] = {6, 5, 1, 6, 5, 7, -654, 65};

        Task1_3P3 task1_3P3 = new Task1_3P3();

        assertEquals(task1_3P3.searchMin(array, 0, 0),-654);
    }
}
