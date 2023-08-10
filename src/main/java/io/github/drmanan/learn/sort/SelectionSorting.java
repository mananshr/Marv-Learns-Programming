/**
 * <H2> SelectionSort </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Thursday, 10 of August, 2023; 06:16:16
 */

package io.github.drmanan.learn.sort;

import static io.github.drmanan.learn.util.Array.generate_random_array;
import static io.github.drmanan.learn.util.Array.print_array;

public class SelectionSorting {
    static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i; 
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) index = j; //select the index of smallest in unsorted array
            }
            if (index != i) { // replace
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = generate_random_array(10, 100);
        // {8, 2, 6, 5, 4, 7, 8, 2, 9, 3, 1, 6}
        // {41, 53, 36, 19, 62, 85, 21}
        // {9, 8, 7, 6, 5, 4, 3, 2, 1}
        print_array('b', arr);
        SelectionSort(arr);
        print_array('a', arr);
    }
}

