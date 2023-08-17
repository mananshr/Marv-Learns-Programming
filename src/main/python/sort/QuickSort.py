from src.main.python.commons.Array import generate_random_array
from src.main.python.commons.Array import print_array


# This function takes the last element as pivot, places
# the pivot element at its correct position in a sorted
# array, and places all smaller (smaller than pivot) to
# the left of pivot and all greater elements to the right of pivot
def partition(array_to_part, low, high):
    i = (low - 1)  # index of smaller element
    pivot = array_to_part[high]  # pivot

    for j in range(low, high):

        # If the current element is smaller than or
        # equal to pivot
        if array_to_part[j] <= pivot:
            # increment index of smaller element
            i = i + 1
            array_to_part[i], array_to_part[j] = array_to_part[j], array_to_part[i]

    array_to_part[i + 1], array_to_part[high] = array_to_part[high], array_to_part[i + 1]
    return (i + 1)


# The main function that implements QuickSort
# arr[] --> Array to be sorted,
# low --> Starting index,
# high --> Ending index

# Function to do Quick sort
def quick_sort(array_to_sort, low, high):
    if low < high:
        # pi is partitioning index, arr[p] is now
        # at the right place
        pi = partition(array_to_sort, low, high)

        # Separately sort elements before
        # partition and after partition
        quick_sort(array_to_sort, low, pi - 1)
        quick_sort(array_to_sort, pi + 1, high)


# array_for_sorting = [10, 7, 8, 9, 1, 5]
array_for_sorting = generate_random_array(10, 15)
print_array(array_for_sorting, position="BEFORE")
n = len(array_for_sorting)
quick_sort(array_for_sorting, 0, n - 1)
print_array(array_for_sorting, position="AFTER")
