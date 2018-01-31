package david;

/**
 * Created by David on 1/31/2018.
 */
public class Task1_7P6 {


    public String findNumberInArray (int array[], int number) {
        int count = array.length / 2;
        int from = 0;
        int to = array.length;

        while (true) {
            if (number == array[count] || number == array[0]) {
                return "Yes";
            } else if (number < array[count]) {
                to = count;
                count = (from + to) / 2;
            } else if (number > array[count]) {
                from = count;
                count = (from + to) / 2;
            }
            if (from == count || to == count) {
                return "No";
            }
        }
    }
}
