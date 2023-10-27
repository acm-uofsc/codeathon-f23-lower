#!/usr/local/bin/python3
from random import randint
case_num = int(input())
# 0 and 1 are the sample cases
if case_num == 0:
    print(1)
    print(1, 2, 3)
elif case_num == 1:
    print(2)
    print(-1, -1, 1)
    print(3, 2, 5)
else:
    # output what should be read in as input by
    # contestant code
    t = randint(1, 20)
    print(t)
    for _ in range(t):
        x = randint(-100, 100)
        y = randint(-100, 100)
        z = randint(-100, 100)
        print(x, y, z)
