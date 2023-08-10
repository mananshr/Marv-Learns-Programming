/**
 * <H2> FindSubsetsLoop </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Friday, 11 of August, 2023; 01:39:09
 */

package io.github.drmanan.learn.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FindSubsetsLoop {
    static int get_bit(int num, int bit) {
        int temp = (1 << bit);
        temp = temp & num;
        if (temp == 0) {
            return 0;
        }
        return 1;
    }

    static void get_all_subsets(List<Integer> v, List<HashSet<Integer>> sets) {
        int subsets_count = (int) (Math.pow(2, v.size()));
        for (int i = 0; i < subsets_count; ++i) {
            HashSet<Integer> set = new HashSet<Integer>();
            for (int j = 0; j < v.size(); ++j) {
                if (get_bit(i, j) == 1) {
                    int x = v.get(j);
                    set.add(x);
                }
            }
            sets.add(set);
        }
    }

    public static void main(String[] args) {
        Integer[] set = new Integer[]{8, 13, 3, 22, 17, 39, 87, 45, 36};
        List<Integer> v = new ArrayList<Integer>();
        Collections.addAll(v, set);
        List<HashSet<Integer>> subsets = new ArrayList<HashSet<Integer>>();

        get_all_subsets(v, subsets);

        System.out.println("****Total*****" + subsets.size());
        for (HashSet<Integer> subset : subsets) {
            System.out.print("{");
            for (Integer it : subset) {
                System.out.print(it + ", ");
            }
            System.out.println("}");
        }
        System.out.println("****Total*****" + subsets.size());
    }
}
