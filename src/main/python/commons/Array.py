import numpy


# def print_array(arr):
#     for num in arr:
#         print(num, sep=", ", end=" ")

def print_array(arr, position=None, step_number=None):
    if position != None:
        print(position, end="\t\t\t\t:\t")

    if step_number!=None:
        print("Step number:\t", step_number, end="\t:\t")

    for num in arr:
        print(num, sep=", ", end=" ")

    print()


def generate_random_array(count, max):
    random_number = numpy.random.randint(0, max, count)
    return random_number;


# print_array(generate_random_array(5, 25), position="Start")
