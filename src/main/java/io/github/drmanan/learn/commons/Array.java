/**
 * <H2> Array </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Thursday, 10 of August, 2023; 06:24:39
 */

package io.github.drmanan.learn.commons;

import io.github.drmanan.learn.commons.log.ConsoleColours;

import java.util.Random;
import java.util.stream.IntStream;

public class Array {
    public static void print_array(int[] arr) {
        for (int i : arr) System.out.print(i + "\t");
    }

    public static void print_array(char c, int[] arr) {
        switch (c) {
            case 'b' -> System.out.print("\nBefore\t:\tArray:\t");
            case 'a' -> System.out.print("\nAfter\t:\tArray:\t");
        }
        print_array(arr);
    }

    public static void print_array(POS position, int[] arr) {
        switch (position) {
            case BEFORE -> System.out.print("\nBefore\t:\tArray:\t");
            case AFTER -> System.out.print("\nAfter\t:\tArray:\t");
        }
        print_array(arr);
    }

    public static void print_array(int step, int[] arr) {
        System.out.print("\nStep " + (step + 1) + "\t:\tArray:\t");
        print_array(arr);
    }

    public static void print_array(int step, int[] arr, int highlight_index) {
        System.out.print("\nStep " + (step + 1) + "\t:\tArray:\t");
        for (int i = 0; i < arr.length; i++) {
            if (i == highlight_index) {
                System.out.print(ConsoleColours.GREEN_UNDERLINED + arr[i] + ConsoleColours.GREEN_UNDERLINED);
                System.out.print(ConsoleColours.RESET + "\t");
            } else {
                System.out.print(arr[i] + "\t");
            }
        }
    }

    public static void print_array(int step, int[] arr, int highlight_index_1, int highlight_index_2) {
        System.out.print("\nStep " + (step + 1) + "\t:\tArray:\t");
        for (int i = 0; i < arr.length; i++) {
            if (i == highlight_index_1) {
                System.out.print(ConsoleColours.RED_UNDERLINED + arr[i] + ConsoleColours.RED_UNDERLINED);
                System.out.print(ConsoleColours.RESET + "\t");
            } else if (i == highlight_index_2) {
                System.out.print(ConsoleColours.GREEN_UNDERLINED + arr[i] + ConsoleColours.GREEN_UNDERLINED);
                System.out.print(ConsoleColours.RESET + "\t");

            } else {
                System.out.print(arr[i] + "\t");
            }
        }
    }

    public static int[] generate_random_array(int n, int max) {
        return IntStream.generate(() -> new Random().nextInt(max)).limit(n).toArray();
    }

    public enum POS {
        BEFORE, AFTER
    }

}
