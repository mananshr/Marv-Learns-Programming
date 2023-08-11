/**
 * <H2> interpolationSearch </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Friday, 11 of August, 2023; 21:33:29
 */

package io.github.drmanan.learn.search;

import io.github.drmanan.learn.commons.DataSet;

public class interpolationSearch {
    public static void main(String[] args) {

        DataSet data = new DataSet(1000000);
        int search = 5000;
        int low = 0;
        int high = data.getSize() - 1;
        int mid = 0;

        while (true) {

            mid = low + ((high - low) / (data.getElement(high) - data.getElement(low))) * (search - data.getElement(low));

            if ((low > high) || (data.getElement(mid) == -1)) {
                System.out.println("number is not found");
                break;
            }

            data.increaseTries();

            if (data.getElement(mid) == search) {
                System.out.println("number is found after " + data.getTries() + " try");
                break;
            }

            if (data.getElement(mid) < search) low = mid + 1;
            if (data.getElement(mid) > search) high = mid - 1;
        }
    }
}
