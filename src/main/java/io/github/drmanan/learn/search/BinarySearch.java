/**
 * <H2> BinarySearch </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Friday, 11 of August, 2023; 21:26:02
 */

package io.github.drmanan.learn.search;

import io.github.drmanan.learn.commons.DataSet;

public class BinarySearch {
    public static void main(String[] args) {

        DataSet data = new DataSet(1000000);
        int Search = 125000;
        int low = 0;
        int high = data.getSize() - 1;
        int mid = 0;

        while (true) {
            if (low > high) {
                System.out.println("number is not found");
                break;
            }
            mid = low + ((high - low) / 2);
            data.increaseTries();
            if (data.getElement(mid) == Search) {
                System.out.println("number is found after " + data.getTries() + " try");
                break;
            }

            if (data.getElement(mid) < Search) low = mid + 1;
            if (data.getElement(mid) > Search) high = mid - 1;

        }
    }
}
