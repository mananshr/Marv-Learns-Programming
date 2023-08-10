/**
 * <H2> FindSubsets </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Friday, 11 of August, 2023; 01:00:16
 */

package io.github.drmanan.learn.sets;

public class FindSubsets {

    // Print all subsets of given set[]
    static void printSubsets(char set[])
    {
        int n = set.length;

        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");

            // Print current subset
            for (int j = 0; j < n; j++)

                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");

            System.out.println("}");
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        char set[] = {'a', 'b', 'c'}; // , 'd' ,'e'
        printSubsets(set);
    }
}
