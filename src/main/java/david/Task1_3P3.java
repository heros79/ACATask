package david;

/**
 * Created by David on 1/30/2018.
 */
public class Task1_3P3 {


/* @param a takes only the value 0*/
    public int searchMin(int array[], int minimum, int a) {
        int min = minimum;
        if (a == 0) {
            min = array[0];
        }

        if (a == array.length - 1) {
            return min;
        }

        if(min > array[a + 1]) {
            min = array[a + 1];
        }

        return searchMin(array, min,a + 1);
    }
}
