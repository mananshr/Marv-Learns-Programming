from src.main.python.commons.Array import generate_random_array
from src.main.python.commons.Array import print_array


def insertion_sort(arrar_to_sort):
    # Traverse through 1 to len(arr)
    for i in range(1, len(arrar_to_sort)):
        key = arrar_to_sort[i]
        # Move elements of arr[0..i-1], that are
        # greater than key, to one position ahead
        # of their current position
        j = i - 1
        while j >= 0 and key < arrar_to_sort[j]:
            arrar_to_sort[j + 1] = arrar_to_sort[j]
            j -= 1
        print_array(arrar_to_sort, step_number=i)
        arrar_to_sort[j + 1] = key  # Driver code to test above


array = generate_random_array(10, 10)
print_array(array, position="BEFORE")
insertion_sort(array)
print_array(array, position="AFTER")
