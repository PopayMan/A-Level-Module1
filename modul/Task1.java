package modul;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        int[] numArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(numArray));
        System.out.println(countOfDifElements(numArray));
    }

    public static int countOfDifElements(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (isUniqueValue(i, arr)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isUniqueValue(int index, int[] arr) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == arr[index]) {
                return false;
            }
        }
        return true;
    }
}