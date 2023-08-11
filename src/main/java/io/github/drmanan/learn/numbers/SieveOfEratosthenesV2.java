/**
 * <H2> SieveOfEratosthenesV2 </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Saturday, 12 of August, 2023; 04:20:05
 */

package io.github.drmanan.learn.numbers;

public class SieveOfEratosthenesV2 {
    static int[] Primes = new int[1000];

    static void SieveOfEratosthenes(int n) {
        Primes[0] = 1;
        for (int i = 3; i * i <= n; i += 2) {
            if (Primes[i / 2] == 0) {
                for (int j = 3 * i; j <= n; j += 2 * i)
                    Primes[j / 2] = 1;
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int n = 121;
        SieveOfEratosthenes(n);
        for (int i = 1; i <= n; i++) {
            if (i == 2) System.out.print(i + " ");
            else if (i % 2 == 1 && Primes[i / 2] == 0) System.out.print(i + " ");
        }
    }
}
