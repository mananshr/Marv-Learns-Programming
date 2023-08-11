/**
 * <H2> DataSet </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Friday, 11 of August, 2023; 21:18:28
 */

package io.github.drmanan.learn.commons;

public class DataSet {
    // Generates and operates a linear sequential dataset of given size

    int[] data;
    int tries;

    public DataSet(int size) {
        data = new int[size];
        for (int i = 1; i <= size; i++)
            data[i - 1] = i;
        tries = 0;
    }

    public int getSize() {
        return data.length;
    }

    public int[] getData() {
        return data;
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public void increaseTries() {
        tries++;
    }

    public int getElement(int index) {
        try {
            return data[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}
