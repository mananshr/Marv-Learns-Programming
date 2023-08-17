/**
 * <H2> Insertion </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Wednesday, 16 of August, 2023; 17:51:56
 */

package io.github.drmanan.learn.sort;

import io.github.drmanan.learn.commons.Array;

import static io.github.drmanan.learn.commons.Array.POS.AFTER;
import static io.github.drmanan.learn.commons.Array.POS.BEFORE;
import static io.github.drmanan.learn.commons.Array.generate_random_array;
import static io.github.drmanan.learn.commons.Array.print_array;

public class InsertionSort {

    // Driver method
    public static void main(String[] args) {
        int[] arr = generate_random_array(20, 100);
        print_array(BEFORE, arr);
        // int[] arr = {12, 11, 13, 5, 6};
        InsertionSort sort = new InsertionSort();
        sort.sort(arr);
        print_array(AFTER, arr);
    }

    /*Function to sort the array using insertion sort*/
    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            print_array((i - 1), arr);
            /* Move elements of arr[0...i-1], that are
            greater than the key, to one position ahead
            of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}