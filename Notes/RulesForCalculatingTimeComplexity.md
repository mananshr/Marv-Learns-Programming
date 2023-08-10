# Rules for Calculating Time Complexity

Some general rules for calculating the time complexity. Sometimes calculating time complexity becomes very complicated , to avoid this, these rules are going to come handy.

A very important thing to keep in mind is that we always assume that the input size is very large.

### Rule 1: Drop constant multipliers.
Eg: Given T(n) = 3n3 , find worst case running time. Using the above rule, we can drop the constant term.
Worst case running time = O(n3)

### Rule 2 : Drop lower order terms.
Eg: Given T(n) = 3n2 + 2nlogn + 5n+4 , find worst case running time.
We know that 3n2 is the highest order term. Therefore we can drop the rest of the terms .
Worst case running time = O(3n2)
We can further reduce this using 1st rule.

∴ Worst case running time = O(n2)

### Rule 3: Running time of a program=  Running time of all fragments
Eg: Calculate the running time of the following program.
```java
for (int i=0;i<n;i++)
{
    int a=5;
    a++;
}

for (int i=0;i<n;i++)
{
   for(int j=0;j<n;j++)
   {
   int b=5;
   b++;
   }
}
```
First of all we can break the program into 2 fragments. The first fragment is the first loop and the second fragment is the second loop (nested loop). Our final answer would be the sum of both fragments.

As we know running time for simple statements like declaration, assignment, arithmetic/logical operations is O(1).

Therefore the time complexity of the first fragment would be O(n), as the loop would run n times, the time complexity of the statements inside the loop is O(1).
Whereas the time complexity of the second fragment would be O(n2).

Time complexity of the program = O(n) + O(n2) = O(n2)