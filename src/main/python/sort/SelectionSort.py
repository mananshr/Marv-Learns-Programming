from src.main.python.commons.Array import generate_random_array
from src.main.python.commons.Array import print_array


def find_min_index(A, start):
    min_index = start
    start += 1

    while start < len(A):
        if A[start] < A[min_index]:
            min_index = start
        start += 1
    return min_index


def selection_sort(A):
    i = 0
    while i < len(A):
        min_index = find_min_index(A, i)
        if i != min_index:
            A[i], A[min_index] = A[min_index], A[i]
        i += 1
        print_array(A, step_number=i)


# A = [5, 2, 6, 7, 2, 1, 0, 3]
A = generate_random_array(10, 10)
print_array(A, position="BEFORE")
selection_sort(A)
print_array(A, position="AFTER")
