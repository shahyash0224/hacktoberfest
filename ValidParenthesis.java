import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

    static boolean checkParenthesis(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char st : s.toCharArray()) {
            if(st == '(' || st == '[' || st == '{') {
                stack.push(st);
            } else {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    char top = (Character) stack.peek();
                    if((top == '(' && st == ')') ||
                       (top == '{' && st == '}') ||
                       (top == '[' && st == ']')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean result = checkParenthesis(str);
        System.out.println(result);
    }
}
