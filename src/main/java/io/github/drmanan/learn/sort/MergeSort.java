/**
 * <H2> MergeSort </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Friday, 11 of August, 2023; 21:14:27
 */

package io.github.drmanan.learn.sort;

import static io.github.drmanan.learn.commons.Array.generate_random_array;
import static io.github.drmanan.learn.commons.Array.print_array;

public class MergeSort {
    int[] array;
    int[] TempArray;

    public static void main(String[] args) {
        int[] arr = generate_random_array(10, 100);
        // {1, 50, 30, 10, 60, 80};
        print_array('b', arr);
        new MergeSort().PrepareForSort(arr);
        print_array('a', arr);
    }

    void PrepareForSort(int[] arr) {
        // prepare for sort
        this.array = arr;
        this.TempArray = new int[arr.length];
        doMergeSort(0, arr.length - 1);
    }

    void doMergeSort(int LowerIndex, int HigherIndex) {

        if (LowerIndex < HigherIndex) {
            int middle = LowerIndex + (HigherIndex - LowerIndex) / 2;
            doMergeSort(LowerIndex, middle); //ex.(1-5)
            doMergeSort(middle + 1, HigherIndex);//ex.(6,10)
            MergePart(LowerIndex, middle, HigherIndex);
        }
    }

    // merge small problems and sort
    void MergePart(int LowerIndex, int middle, int HigherIndex) {
        if (HigherIndex + 1 - LowerIndex >= 0)
            System.arraycopy(array, LowerIndex, TempArray, LowerIndex, HigherIndex + 1 - LowerIndex);
        int i = LowerIndex;
        int j = middle + 1;
        int k = LowerIndex;
        while (i <= middle && j <= HigherIndex) {
            if (TempArray[i] <= TempArray[j]) {
                array[k] = TempArray[i];
                i++;
            } else {
                array[k] = TempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = TempArray[i];
            k++;
            i++;
        }
    }
}
