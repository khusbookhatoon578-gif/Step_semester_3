package practice_problems;

import java.util.Arrays;

public class L4MergeTwoSortedArrays {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            result[k++] = arr1[i++];
        }

        while (j < n2) {
            result[k++] = arr2[j++];
        }

        return result;
    } // Closes mergeSortedArrays method

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 7};
        int[] arr2 = {3, 6, 9};
        System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2)));

        int[] emptyArr = {};
        int[] arr3 = {1, 2, 4};
        System.out.println(Arrays.toString(mergeSortedArrays(emptyArr, arr3)));
    }

}


