package algorithms.search.linear_search;

import java.util.Random;

public class LinearSearch {

    public static void main(String[] args) {
        Random rand = new Random();
        // int guess = rand.nextInt(1000);
        int guess = 1000;

        long[] timeArr = new long[1000];

        for (int i = 0; i < timeArr.length; i++) {
            int[] arr = generateRandomArr(timeArr.length);

            long arrSearchStartTime = System.nanoTime();

            int index = findByLinearSearch(arr, guess);

            long arrSearchEndTime = System.nanoTime();
            long arrSearchDuration = arrSearchEndTime - arrSearchStartTime;
            System.out.println("Tempo de execução para Linear Search: " + (arrSearchDuration) + " ns");

            timeArr[i] = arrSearchDuration;
        }

        int sum = 0;

        for (int i = 0; i < timeArr.length; i++) {
            sum += timeArr[i];
        }

        System.out.println("Tempo médio de execução para Linear Search: " + (sum / (double) timeArr.length) + " ns");
    }

    public static int findByLinearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int[] generateRandomArr(int size) {
        Random r = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(1000);
        }

        return arr;
    }
}
