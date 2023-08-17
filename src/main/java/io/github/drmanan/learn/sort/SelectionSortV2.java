/**
 * <H2> SelectionSortV2 </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Thursday, 17 of August, 2023; 10:12:36
 */

package io.github.drmanan.learn.sort;

import static io.github.drmanan.learn.commons.Array.POSITION.AFTER;
import static io.github.drmanan.learn.commons.Array.POSITION.BEFORE;
import static io.github.drmanan.learn.commons.Array.generate_random_array;
import static io.github.drmanan.learn.commons.Array.print_array;


public class SelectionSortV2 {
    public static void main(String[] args) {
        int[] A = generate_random_array(10, 10);
        // int[] A = {5, 2, 6, 7, 2, 1, 0, 3};
        print_array(BEFORE, A);
        SelectionSortV2 sort = new SelectionSortV2();
        sort.selectionSort(A);
        print_array(AFTER, A);
    }

    void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    int findMinIndex(int[] A, int start) {
        int min_index = start++;

        while (start < A.length) {
            if (A[start] < A[min_index]) min_index = start;
            start++;
        }

        return min_index;
    }

    void selectionSort(int[] A) {
        for (int i = 0; i < A.length; ++i) {
            int min_index = findMinIndex(A, i);
            if (i != min_index) swap(A, i, min_index);
            print_array(i, A);
        }
    }
}
