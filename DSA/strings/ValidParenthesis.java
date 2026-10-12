import java.util.Stack;

public class ValidParenthesis {
	public static boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<>();

		for (char ch : input.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty()) {
					return false;
				}

				char opening = stack.pop();
				if ((ch == ')' && opening != '(')
						|| (ch == ']' && opening != '[')
						|| (ch == '}' && opening != '{')) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String input = "{[()]}";
		System.out.println(isBalanced(input)
				? "Parentheses are balanced"
				: "Parentheses are not balanced");
	}
}

/*
 * Logic Explanation:
 * This program checks whether a string containing parentheses, square brackets,
 * and curly braces is balanced.
 *
 * 1. We use a Stack to keep track of opening brackets as they appear.
 *    - When we see '(', '[', or '{', we push it onto the stack.
 * 2. When we see a closing bracket, we check whether the stack is empty.
 *    - If the stack is empty, then there is no matching opening bracket, so the
 *      expression is invalid.
 * 3. We pop the top of the stack and compare it with the closing bracket.
 *    - For example, if we see ')', it must match the last opening bracket '('.
 *    - If there is a mismatch, the expression is invalid.
 * 4. After scanning the entire string, the expression is balanced only if the
 *    stack is empty.
 *
 * Example:
 * Input: "{[()]}"
 * Process:
 * - push '{' -> stack = ['{']
 * - push '[' -> stack = ['{', '[']
 * - push '(' -> stack = ['{', '[', '(']
 * - close ')' -> pop '(' and match -> stack = ['{', '[']
 * - close ']' -> pop '[' and match -> stack = ['{']
 * - close '}' -> pop '{' and match -> stack = []
 *
 * Final result: balanced, so the program prints:
 * "Parentheses are balanced"
 */
