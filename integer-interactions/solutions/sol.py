t = int(input())
for _ in range(t):
    line = input().split()
    x = int(line[0])
    y = int(line[1])
    z = int(line[2])

    answer = y * z + x
    print(answer)