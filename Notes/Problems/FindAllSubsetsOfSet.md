# Find all subsets of set (power set) in java

Here we will see how to find all subsets of set aka **power set**.

## Problem
> Given a set of distinct integers, arr, return all possible subsets (the power set).

### Example

For a given **set = {a, b, c}**

#### Subsets
```text
{ }
{ a }
{ b }
{ a b }
{ c }
{ a c }
{ b c }
{ a b c }
```

We will use multiple approaches here.

## Approach 1: Using recursion

You can find all subsets of set or power set using recursion. Here is the simple approach.

As each recursion call will represent subset here, we will add resultList(see recursion code below) to the list of subsets in each call.
- Iterate over elements of a set.
- In each iteration
  - Add elements to the list
  - explore(recursion) and make start = i+1 to go through remaining elements of the array.
  - Remove element from the list.

Here is java code for recursion. [Full Code here](../../src/main/java/io/github/drmanan/learn/sets/FindSubsetsRecursion.java)

```java
void subsetsHelper(List<List<Integer>> list, List<Integer> resultList, int[] nums, int start) {
    list.add(new ArrayList<>(resultList));
    for (int i = start; i < nums.length; i++) {
        // add element
        resultList.add(nums[i]);
        // Explore
        subsetsHelper(list, resultList, nums, i + 1); // Calling it recursively
        // remove
        resultList.remove(resultList.size() - 1);
    }
}
```

Let us try to understand it with the help of the following diagram. If you notice, each node(resultList) represent subset here.
![Recursion approach for subsets of set = 1, 2, 3](../../Assets/PowerSetRecursion.webp)

## Approach 2: Using bit manipulation
We can find all subsets of set or power set using iteration as well.

There will be 2^N subsets for a given set, where N is the number of elements in set.
For example, there will be 2^4 = 16 subsets for the set {1, 2, 3, 4}.

Each ‘1’ in the binary representation indicate an element in that position.
For example, the binary representation of number 6 is 0101 which in turn represents the subset {1, 3} of the set {1, 2, 3, 4}.

![Example of Bit Manupalation approach for subsets = 1, 3 of set = 1, 2, 3](../../Assets/PowerSetBitManuEx.webp)

How can we find out which bit is set for binary representation, so that we can include the element in the subset?

To check if 0th bit is set, you can do logical & with 1. <br/>
To check if 1st bit is set, you can do logical & with 2. <br/>
To check if 2nd bit is set, you can do logical & with 2^2. <br/>
and so on.... <br/>
To check if nth bit is set, you can do logical & with 2^n.

Let’s say with the help of example:

For a set {1 ,2, 3} <br/>
0 1 1  &  0 0 1 = 1    –> 1 will be included in subset. <br/>
0 1 1  &  0 1 0 = 1    –> 2 will be included in subset. <br/>
0 1 1  &  1 0  0 =0   –> 3 will not be included in subset.

Here is java code for the bit approach. [Full code here.](../../src/main/java/io/github/drmanan/learn/sets/FindSubsetsBitMasking.java)
```java
void printSubsets(int set[])
{
    int n = set.length;

    // Run a loop from 0 to 2^n
    for (int i = 0; i < (1<<n); i++)
    {
        System.out.print("{ ");
        int m = 1; // m is used to check set bit in binary representation.
        // Print current subset
        for (int j = 0; j < n; j++)
        {
            if ((i & m) > 0)
            {       
                System.out.print(set[j] + " ");
            }
            m = m << 1;
        }

        System.out.println("}");
    }
}
```