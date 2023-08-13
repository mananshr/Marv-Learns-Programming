# Quiz on Time and space complexity

1. What is the time complexity of the following code :
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

2. What is the time, space complexity of the following code :
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