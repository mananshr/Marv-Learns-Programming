# Understanding Time Complexity of Computer Programs

## What is Time Complexity and Why is it Vital?

Imagine a scenario where your friend has selected a number between 1 and 1000 and challenged you to guess it. If your guess is right, they'll confirm it; otherwise, if your guess is too large, they'll say it's 'too big,' and if it's too small, they'll say it's 'too small.' Let's explore a couple of strategies to find the number:

### Example

The brute force approach: Guess each number from 1 to 1000 and see if it's correct.
The smarter approach: Start with the middle number. If it's 'too big,' focus on the left side; if it's 'too small,' focus on the right side. Repeat until you get the correct number.
Which strategy seems better to you? As you might have deduced, the second strategy is much more efficient than the first. In the worst case, the first strategy could take up to 1000 guesses (if the number is 1000), while the second strategy would only need around 10 guesses in the worst case (thanks to halving the possibilities with each guess).

> In the context of computer programs, the time complexity of the first strategy is denoted as O(n), while the second strategy has a time complexity of O(logn).

As demonstrated by the example, various approaches can exist for solving the same problem. This applies to computer programming as well. Each approach (algorithm) may consume different amounts of time, space, and computational power. Thus, a method is needed to distinguish between these approaches and select the most efficient one.

In this lecture, we will delve into how we can choose the best algorithm based on its execution time. But how can we compare algorithms written in different languages and running on different machines? This is precisely where the concept of time complexity comes into play. So, what exactly is time complexity?

> By definition, time complexity refers to the time an algorithm or program takes to run as a function of the input size.

## Why is Time Complexity so Crucial?

- It provides a clear way to differentiate between two algorithms based on their efficiency.
- It remains unaffected by the specific machine on which the algorithm is executed.
- It establishes a direct relationship with the input size.

Importantly, time complexity doesn't directly measure the actual time an algorithm takes to run (since that can depend on factors like programming language and processing power). Instead, it calculates an algorithm's execution time in terms of the algorithm itself and its inputs.

## How to Determine Execution Time?

Calculating the running time of an algorithm involves considering several factors, including computer architecture (32 or 64-bit), the number of processors, read and write speeds, machine configuration, input size, and more.

However, to simplify matters, let's focus on a scenario where we treat the input as the main variable and keep other factors consistent. In essence, we'll assume our machine possesses the following characteristics:

- Single processor
- 32-bit architecture
- Sequential execution
- Each arithmetic and logical operation takes 1 unit of time

In this controlled context, we can better understand and estimate the execution time of an algorithm.

Let’s define a function T(n) as the runtime of a program as a function of the input.

Here are some operations for which T(n)=1

- Assignment operator/ return statement  (Eg: int a=10).
- Arithmetic operations (Eg: + , - , * , / ).
- Logical operations ( Eg: & , | , ^).

Example:

```java
boolean Find_One(arr[],int n)
{
   for (int i=0; i < n ; i++)
      if ( arr[i] == 1)
         return true;
   return false;
}
```

Is it possible to find the running time of the above algorithm without knowing the arr[]?

We can only measure the best and the worst running time of the above algorithm.

In the best case, the running time of the above algorithm would be constant ( the first element of the array itself is 1), whereas in the worst case the running time of the above algorithm would be linear ( there is no 1 in the array ).

Now To define complexity, We use Asymptotic notations which we cover next.  

