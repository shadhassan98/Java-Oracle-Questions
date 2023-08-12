package Others;
import java.util.LinkedList;

public class postfix {
    public static int evaluate_postfix(String expression) {

    LinkedList<Integer> stack = new LinkedList<>();
    char[] expression_array = expression.toCharArray();

    for (char ch : expression_array){

        if (Character.isDigit(ch))
            stack.push(Character.getNumericValue(ch));
        else{
            int operand2 = stack.pop();
            int operand1 = stack.pop();
            switch(ch) {
                case('+'):
                    stack.push(operand1 + operand2);
                    break;
                case '-':
                    stack.push(operand1 - operand2);
                    break;
                case '*':
                    stack.push(operand1 * operand2);
                    break;
                case '/':
                    stack.push(operand1 / operand2);
                    break;
            }
        }
    }
    return stack.pop();
    }   

    public static void main(String[] args) {
        String postfix_expression = "42+63/*";
        int result = evaluate_postfix(postfix_expression);
        System.out.println("Result of the postfix expression:" + result);
    }

}
