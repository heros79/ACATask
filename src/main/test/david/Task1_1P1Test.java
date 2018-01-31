package david;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by David on 1/30/2018.
 */
public class Task1_1P1Test {

    @Test
    public void rotateMatrix90DegreesTest() {

        int testArray[] = {13 , 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3, 16, 12, 8, 4};

        int arr[][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};

        int testTmpArray [] = new int [16];

        Task1_1P1 task1_1P1 = new Task1_1P1();

        int tmpArr [][] = task1_1P1.rotateMatrix90Degrees(arr);

        for (int i = 0; i < arr.length; i ++) {
            for(int j = 0; j < arr.length; j ++) {
                testTmpArray[(i * arr.length) + j] = tmpArr[i][j];
            }
        }

        assertArrayEquals(testTmpArray, testArray);
    }
}
