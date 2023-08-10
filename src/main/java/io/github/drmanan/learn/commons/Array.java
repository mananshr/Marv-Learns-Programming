/**
 * <H2> Array </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Thursday, 10 of August, 2023; 06:24:39
 */

package io.github.drmanan.learn.commons;

import java.util.Random;
import java.util.stream.IntStream;

public class Array {
    public static void print_array(int[] arr) {
        for (int i : arr) System.out.print(i + "\t");
    }

    public static void print_array(char c, int[] arr) {
        switch (c) {
            case 'b' -> System.out.println("\nBefore");
            case 'a' -> System.out.println("\nAfter");
        }
        print_array(arr);
    }

    public static void print_array(int step, int[] arr) {
        System.out.print("\nStep " + (step + 1) + ":\tArray: \t");
        print_array(arr);
    }

    public static int[] generate_random_array(int n, int max) {
        return IntStream.generate(() -> new Random().nextInt(max)).limit(n).toArray();
    }

}
