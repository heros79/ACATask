package david;

/**
 * Created by David on 1/30/2018.
 */
public class Task1_2P2 {

    public int[] sortArray(int array[]) {
        int temp;
        int count = 0;

        for (int i = 0; i < array.length; i ++) {
            if (array[i] == 0) {
                count++;
            }
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] < array[j] && array[j - 1] == 0) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = array.length - (count / 2) - 1; i >= count / 2; i --) {
            array[i] = array[i - (count / 2)];
        }

        for (int i = 0; i < count / 2; i ++) {
            array[i] = 0;
        }
        return array;
    }
}
