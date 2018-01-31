package david;

/**
 * Created by David on 1/30/2018.
 */
public class Task1_1P1 {

    public int[][] rotateMatrix90Degrees(int array[][]) {
        int [] [] rotateArray = new int[array.length][array.length];

        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[i].length; j ++) {
                rotateArray[j][(array.length - 1) - i] = array[i][j];
            }
        }

        return rotateArray;
    }
}
