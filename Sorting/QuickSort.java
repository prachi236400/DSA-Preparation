package Sorting;
public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pIndex = partition(arr, low, high);

            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[low];   // first element as pivot
        int i = low;
        int j = high;

        while (i < j) {

            // move i right until element > pivot
            while (i <= high - 1 && arr[i] <= pivot) {
                i++;
            }

            // move j left until element <= pivot
            while (j >= low + 1 && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }

        // place pivot in correct position
        swap(arr, low, j);

        return j;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
