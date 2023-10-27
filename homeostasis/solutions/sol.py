open_brackets = ['(', '{', '[']
close_brackets = [')', '}', ']']
bracket_conversion = {
    '(': ')',
    '{': '}',
    '[': ']'
}

def sol(brackets: str) -> bool:
    # Odd lengths cannot be valid
    if len(brackets) % 2 != 0:
        return False

    stack = []
    for bracket in brackets:
        if bracket in open_brackets:
            stack.append(bracket)
        else:
            if len(stack) == 0:
                return False
            if bracket_conversion[stack.pop()] != bracket:
                return False

    assert not stack
    return True


if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        answer = sol(input())
        print(answer)
