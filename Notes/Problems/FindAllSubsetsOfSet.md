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

Here is java code for recursion.

```java

```