package david;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by David on 1/30/2018.
 */
public class Task1_2P2Test {

    @Test
    public void sortArrayTest() {

        int arr[] = {1, 6, 98, 0, 15, 16, 65, 0, 0, 654, 98, 0};
        int rightArr[] = {0, 0, 1, 6, 98, 15, 16, 65, 654, 98, 0, 0};

        Task1_2P2 task1_2P2 = new Task1_2P2();

        assertArrayEquals(rightArr, task1_2P2.sortArray(arr));

    }

}
