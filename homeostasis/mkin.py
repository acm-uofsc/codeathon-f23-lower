#!/usr/local/bin/python3
from random import randint, choices
case_num = int(input())
# 0 and 1 are the sample cases

open_brackets = ['(', '{', '[']
close_brackets = [')', '}', ']']
all_brackets = open_brackets + close_brackets


def get_correct_string(length: int) -> str:
    assert length % 2 == 0
    stack = []
    ret = ''
    for i in range(length // 2):
        is_open = randint(0, 1)
        if is_open:
            bracket_idx = randint(0, len(open_brackets) - 1)
            ret += open_brackets[bracket_idx]
            stack.append(close_brackets[bracket_idx])
        else:
            if len(stack) == 0:
                bracket_idx = randint(0, len(open_brackets) - 1)
                ret += open_brackets[bracket_idx]
                stack.append(close_brackets[bracket_idx])
            else:
                ret += stack.pop()

    while len(stack):
        ret += stack.pop()
    return ret


def get_incorrect_string(length: int) -> str:
    return ''.join(choices(all_brackets, k=length))


if case_num == 0:
    print(1)
    print("()")
elif case_num == 1:
    print(2)
    print("()[]{}")
    print("[()}")
else:
    # output what should be read in as input by
    # contestant code
    t = randint(1, 25)
    n = randint(1, 10**4 - 1)
    print(t)
    for _ in range(t):
        correct = randint(0, 1)
        if correct:
            if n % 2 != 0:
                n += 1
            print(get_correct_string(n))
        else:
            print(get_incorrect_string(n))
