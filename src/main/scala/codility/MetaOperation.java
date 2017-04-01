package codility;

import java.util.Stack;
import java.util.regex.Pattern;

/**
 * Created by faiaz on 01.04.17.
 */
public class MetaOperation {
    public static void main(String[] args) {
        String example = "13+62*7+*";
        String example1 = "11++";
        String example2 = "1+45*2+3";
        String example3 = "";
        System.out.println(solution(example3));
    }

    public static int solution(String string) {
        Stack<Integer> stack = new Stack<Integer>();
        char arr[] = string.toCharArray();

        for (char anArr : arr) {
            if (Character.isDigit(anArr)) {
                stack.push(Integer.parseInt("" + anArr));
            } else if (anArr == '+') {
                try {
                    stack.push(stack.pop() + stack.pop());
                } catch (Exception ex) {
                    return -1;
                }
            } else if (anArr == '*') {
                try {
                    stack.push(stack.pop() * stack.pop());
                } catch (Exception ex) {
                    return -1;
                }
            }
        }

        try {
            return stack.pop();
        } catch (Exception ex) {
            return -1;
        }
    }
}
