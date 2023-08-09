# Asymptotic notations
Asymptotic notations are mathematical notations which are used to describe the running time of an algorithm when input tends towards infinity.

For example, in the [time complexity][1] section, we discussed an example where we had to find ‘1’ in the array. We saw that when the input array had ‘1’ in its first position the time taken by the algorithm was constant, whereas when the array had ‘1’ in its last position or did not have ‘1’ at all, the time taken by the algorithm was linear.

There are mainly 3 types of Asymptotic notations:

1. Big-O notation: The Big-O notation describes the worst-case running time of an algorithm. It is computed by counting the number of operations it will take in the worst-case scenario with the input ‘n’.
    ```
    O(g(n)) = { f(n): there exist positive constants c and n0
               such that 0 ≤ f(n) ≤ cg(n) for all n ≥ n0 }
    ```
2. **Big Omega() notation**: The notation describes the best running time of an algorithm. It is computed by counting the number of operations it will take in the best-case scenario with the input ‘n’.
    ```
    Ω(g(n)) = { f(n): there exist positive constants c and n0 
               such that 0 ≤ cg(n) ≤ f(n) for all n ≥ n0 }
    ```
3. **Big Theta() Notation**: The theta notation encloses the function from above and below, therefore it defines the exact asymptotic behaviour. The notation is used for analyzing the average runtime of an algorithm.
    ```
    Θ(g(n)) = { f(n): there exist positive constants c1, c2 and n0
               such that 0 ≤ c1g(n) ≤ f(n) ≤ c2g(n) for all n ≥ n0 }
    ```
It’s important to note here that O, and are not functions. For example, O(n) represents the class of all functions that grow at most as quickly as the linear function f(n)=n.

Big-O notations give us a convenient way to talk about upper bounds. For example, we can say the time complexity of the algorithm is O(n^3) ( i.e. T(n)  O(n^3) ), which means that the running time of the algorithm is at most cubic.

Another point to note here is that running time and time complexity are two different things, for example, if the running time of an algorithm is the following T(n)= 3*n^2 + 4*n + 2, the time complexity would be O(n^2).

### Types of Time Complexity

[//]: # (Links and references)
[1]: TimeComplexity.md