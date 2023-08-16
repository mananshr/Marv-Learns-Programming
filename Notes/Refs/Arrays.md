# Array implementation in various languages

## C

#### Array declaration :

```java
int A[1000]; // creates an integer array of size 1000. 
int *A = (int *) malloc(1000 * sizeof(int)); // creates an integer array of size 1000
```

#### Accessing ith element :
```java
A[i]
```

## C++

C style arrays work in C++ as well.

However, C++ provides vectors which are much more powerful than C arrays. 

#### Vector declaration:
```java
vector<int> V; // declares an empty integer array of size 0. O(1)
vector<int> V(100, 1); // declares an integer array of size 100 with all elements initialized to 1. O(size)
```
#### Accessing ith element:
`V[i] // O(1)`

#### Size ( number of elements ) of the vector:
`V.size()  // O(1)`

#### Adding element to the vector:
`V.push_back(new_value); // new_value will be appended to the vector.  O(1)`

#### Removing an element from the end of the vector:
`V.pop_back(); // equivalent to size--; O(1)`

## JAVA
Java has multiple ways of representing arrays. For the purpose of problem solving on this site, we will limit ourselves to ArrayList.

Array declaration:
```java
ArrayList<Integer> A = new ArrayList<Integer>(); // declares an empty integer array. O(1)
ArrayList<Integer> A = new ArrayList<Integer>(B); // creates a copy of list B.  O(size of B)
```
#### Accessing ith element:
`A.get(i)     // O(1)`

#### Setting i-th element:
`A.set(i, newValue)  // O(1)`

#### Size of the list:
`A.size()  // O(1) operation`

#### Adding elements to the list:
```java
A.add(newValue); // appends to the end of the list. O(1) operation.
A.add(index, newValue); // add the value at specified index. O(size - index) operation.
``` 

## PYTHON :
Python too has multiple ways of representing arrays. lists are used primarily for the purpose. In few cases, tuples are used when we desire the array to be immutable ( its desired that no one can change the content of the array ).

#### List declaration:
`A = []; # declares an empty list. O(1)`

#### Accessing the ith element:
`A[i]  # O(1)`
#### Adding element to the list:
`A.append(newValue); # O(1)`
#### Size of the list:
`len(A)  # O(1)` 