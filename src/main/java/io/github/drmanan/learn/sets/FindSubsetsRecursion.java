/**
 * <H2> PowerSets </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Friday, 11 of August, 2023; 01:25:31
 */

package io.github.drmanan.learn.sets;

import java.util.ArrayList;
import java.util.List;

public class FindSubsetsRecursion {
    public static void main(String[] args) {

        FindSubsetsRecursion fsr = new FindSubsetsRecursion();
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> subsets = fsr.subsets(nums);

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subsetsHelper(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void subsetsHelper(List<List<Integer>> list, List<Integer> resultList, int[] nums, int start) {
        list.add(new ArrayList<>(resultList));
        for (int i = start; i < nums.length; i++) {
            // add element
            resultList.add(nums[i]);
            // Explore
            subsetsHelper(list, resultList, nums, i + 1);
            // remove
            resultList.remove(resultList.size() - 1);
        }
    }
}
