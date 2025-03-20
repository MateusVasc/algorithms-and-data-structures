package algorithms.search.binary_search;

public class BinarySearch {

    public static int findByBinarySearch(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (n == arr[mid]) {
                return mid;
            }

            if (n < arr[mid]) {
                right = mid - 1;
            }

            if (n > arr[mid]) {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findByBinarySearch(arr, 22));
    }
}
