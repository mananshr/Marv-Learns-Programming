# Quiz on Time and space complexity

### What is the time complexity of the following code:
```java
int j = 0;
for(i = 0; i < n; ++i) {
    while(j < n && arr[i] < arr[j]) {
        j++;
    }
}
```
- [ ] O(n^2)
- [ ] O(n*log(n))
- [ ] O(n(logn)^2)
- [x] O(n)
- [ ] O(n * sqrt(n))
- [ ] O((n^2)*(log(n)))
- [ ] Can't say. Depends on the value of arr.

### What is the time, space complexity of the following code:
```java
int a = 0, b = 0;    
for (i = 0; i < N; i++) {
    a = a + rand();  
}
for (j = 0; j < M; j++) {
    b = b + rand();
}
```
> Assume that rand() is O(1) time, O(1) space function.

- [ ] O(N * M) time, O(1) space
- [ ] O(N + M) time, O(N + M) space
- [x] O(N + M) time, O(1) space
- [ ] O(N * M) time, O(N + M) space
- [ ] O(N * M) time, O(N * M) space

### What is the time, space complexity of the following code:

```java
int a = 0, b = 0;

for (i = 0; i < N; i++) {
    for (j = 0; j < N; j++) {
        a = a + j;
    }
}

for (k = 0; k < N; k++) {
    b = b + k;
}
```

- [x] O(N * N) time, O(1) space 
- [ ] O(N) time, O(N) space
- [ ] O(N * N * N) time, O(1) space
- [ ] O(N * N) time, O(N) space

### What is the time complexity of the following code:

```java
int a = 0;
for (i = 0; i < N; i++) {
    for (j = N; j > i; j--) {
        a = a + i + j;
    }
}
```
- [ ] O(N)
- [ ] O(N*log(N))
- [ ] O(N * Sqrt(N))
- [x] O(N*N)

### What does it mean when we say that an algorithm X is asymptotically more efficient than Y?

- [ ] X will always be a better choice for all inputs
- [x] X will always be a better choice for large inputs
- [ ] X will always be a better choice for small inputs
- [ ] Y will always be a better choice for small inputs