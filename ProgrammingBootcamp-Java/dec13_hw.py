# Swap case:

# Write a program to accept a string
# Swap their cases => lower becomes upper case, upper case becomes lower case
# e.g. 'a' -> 'A', 'Z' -> 'z'
# e.g. 'HeLLo' will become 'hEllO'

# Note: you cannot use string methods like .upper(), .lower() or .swap_case()
# Hint: use functions ord() and chr() to convert between their ASCII values

# for i 

def swap_case(char):

    distance = 0
    ascii_num = ord(char)

    # uppercase => lowercase
    if ascii_num >= 65 and ascii_num <= 90:
        distance = 32
    # lower => upper
    elif ascii_num >= 97 and ascii_num <= 122:
        distance = -32

    converted_ascii_num = ascii_num + distance

    new_ascii_char = chr(converted_ascii_num)

    # print(new_ascii_char)

    return new_ascii_char

# swap_case('k')
# swap_case('a')
# swap_case('G')
# swap_case('2')
# swap_case('P')

text = input('Enter something: ')

swapped_text = ''

for i in range(len(text)):
    # print(text[i])
    new_char = swap_case(text[i])
    # print(new_char)
    swapped_text += new_char

print('Swapped text:', swapped_text)
# text = 'hello'

# print(text[2])

# Variable naming convention
# thisisalongassname

# camelCase -> thisIsALongAssName
# snake_case -> this_is_a_long_ass_name

# student1, student2 => OK
# 1student => not OK

# !$%&*

# constant vs variable

# PI = 3.14

# E = 2.71


# age = 19
# BIRTHYEAR = 2004

