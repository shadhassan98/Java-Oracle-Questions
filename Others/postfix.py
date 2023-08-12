def evaluate_postfix(expression):
    stack = []

    for ch in expression:
        if ch.isdigit():
            stack.append(int(ch))
        else:
            operand2 = stack.pop()
            operand1 = stack.pop()

            if ch == '+':
                stack.append(operand1 + operand2)
            elif ch == '-':
                stack.append(operand1 - operand2)
            elif ch == '*':
                stack.append(operand1 * operand2)
            elif ch == '/':
                stack.append(operand1 / operand2)

    return stack.pop()

postfix_expression = "42+63/*"
result = evaluate_postfix(postfix_expression)
print("Result of the postfix expression:", result)  # Output: 10
