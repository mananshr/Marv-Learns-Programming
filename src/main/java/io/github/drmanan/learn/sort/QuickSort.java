/**
 * <H2> QuickSorting </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Thursday, 10 of August, 2023; 06:45:56
 */

package io.github.drmanan.learn.sort;

import static io.github.drmanan.learn.commons.Array.generate_random_array;
import static io.github.drmanan.learn.commons.Array.print_array;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = generate_random_array(5, 10);
        print_array('b', arr);
        Sort(arr, 0, arr.length - 1);
        print_array('a', arr);
    }

    static void Sort(int[] arr, int low, int high) {
        if (low > high) return;
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) Sort(arr, low, j);
        if (high > i) Sort(arr, i, high);
    }
}
