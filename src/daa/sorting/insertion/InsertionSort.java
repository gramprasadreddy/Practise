package daa.sorting.insertion;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] intArr = {12, 11, 13, 5, 6};
        InsertionSort insertionSort = new InsertionSort();
        int[] sortedArr = insertionSort.sortedArrayUsingInsertionSort(intArr);

        // print sorted Array
        System.out.println(Arrays.toString(sortedArr));
    }

    public int[] sortedArrayUsingInsertionSort(int[] arr) {

        /*12,11,13,5,6
         * step1: 11,12,13,5,6 key = 11
         * step2: 11,12,13,5,6 key = 13
         * step3: 5,11,12,13,6 key = 5
         * step4: 5,6,11,12,13 key =6 and array is sorted*/

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

        }

        return arr;
    }
}
