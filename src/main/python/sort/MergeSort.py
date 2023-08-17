from src.main.python.commons.Array import generate_random_array
from src.main.python.commons.Array import print_array


# Merges two sub-arrays of arr[].
# First subarray is arr[l..m]
# Second subarray is arr[m+1..r]


def merge(array_to_merge, l, m, r):
    n1 = m - l + 1
    n2 = r - m

    # create temp arrays
    L = [0] * (n1)
    R = [0] * (n2)

    # Copy data to temp arrays L[] and R[]
    for i in range(0, n1):
        L[i] = array_to_merge[l + i]

    for j in range(0, n2):
        R[j] = array_to_merge[m + 1 + j]

    # Merge the temp arrays back into arr[l..r]
    i = 0  # Initial index of first subarray
    j = 0  # Initial index of second subarray
    k = l  # Initial index of merged subarray

    while i < n1 and j < n2:
        if L[i] <= R[j]:
            array_to_merge[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1
        k += 1

    # Copy the remaining elements of L[], if there
    # are any
    while i < n1:
        array_to_merge[k] = L[i]
        i += 1
        k += 1

    # Copy the remaining elements of R[], if there
    # are any
    while j < n2:
        array_to_merge[k] = R[j]
        j += 1
        k += 1


# l is for left index and r is right index of the sub-array of arr to be sorted


def merge_sort(array_to_sort, l, r):
    if l < r:
        # Same as (l+r)//2, but avoids overflow for
        # large l and h
        m = l + (r - l) // 2

        # Sort first and second halves
        merge_sort(array_to_sort, l, m)
        merge_sort(array_to_sort, m + 1, r)
        merge(array_to_sort, l, m, r)


# Driver code to test above
# arr = [12, 11, 13, 5, 6, 7]
arr = generate_random_array(10, 10)
n = len(arr)
print_array(arr, position="BEFORE")
merge_sort(arr, 0, n - 1)
print_array(arr, position="AFTER")
