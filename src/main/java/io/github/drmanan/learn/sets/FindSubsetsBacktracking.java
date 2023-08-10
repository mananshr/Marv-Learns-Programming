/**
 * <H2> FindSubsetsBacktracking </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Friday, 11 of August, 2023; 01:32:58
 */

package io.github.drmanan.learn.sets;

import java.util.ArrayList;
import java.util.Collections;

public class FindSubsetsBacktracking {

    public static void main(String[] args) {

        // creating an object of the class SubsetIntArr
        FindSubsetsBacktracking fsb = new FindSubsetsBacktracking();

        // creating an object of the class ArrayList
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        // input 1: 1, 2, 3
        for (int j = 1; j <= 3; j++) {
            arrList.add(j);
        }

        System.out.println("For the array list: " + arrList + " \n");
        System.out.println("The subsets are: ");
        fsb.displayAllSubsets(arrList.size(), arrList);
        System.out.println();
        arrList.clear();

        // input 2: 1, 2, 3, 4, 5
        for (int j = 1; j <= 5; j++) {
            arrList.add(j);
        }

        System.out.println("For the array list: " + arrList + " \n");
        System.out.println("The subsets are: ");
        fsb.displayAllSubsets(arrList.size(), arrList);

    }

    // method that displays all the subsets with the help of the method getSubsets
    public void displayAllSubsets(int s, ArrayList<Integer> inputArrList) {

        // 2D list for keeping all the subset found answer
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

        // a temporary list for keeping the current subset
        ArrayList<Integer> tmp = new ArrayList<>();

        // the first call to the recursive method
        getSubsets(0, tmp, answer, inputArrList);

        // Printing the final answer
        for (ArrayList<Integer> integers : answer) {
            // Sorting and printing each subset
            Collections.sort(integers);
            System.out.print("[ ");
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.print("]");
            System.out.println();
        }

    }

    // a method that generates all the subsets of the input list
    private void getSubsets(int i, ArrayList<Integer> tmp, ArrayList<ArrayList<Integer>> answer, ArrayList<Integer> inputArrList) {
        // handling the base case
        if (i == inputArrList.size()) {
        // including the generated current subset (which is non empty) to the 2D list answer
            if (!tmp.isEmpty()) {
                answer.add(tmp);
            }
            return;
        }
        // Invoking the subset that has the ith array element inside it
        ArrayList<Integer> tmp1 = new ArrayList<>(tmp);
        tmp1.add(inputArrList.get(i));
        getSubsets(i + 1, tmp1, answer, inputArrList);

        // Generating the subset that will not contain the ith array element
        getSubsets(i + 1, tmp, answer, inputArrList);
    }
}