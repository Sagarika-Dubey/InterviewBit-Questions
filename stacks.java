import java.util.*;

public class stacks {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int flag = 0;
        Stack<Character> stack;
        for (int i = 0; i < n; i++) {
            flag = 0;
            stack = new Stack<Character>();
            String str = sc.nextLine();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '(') {
                    stack.push(c);
                    continue;
                }
                if (stack.isEmpty()) {
                    flag = 1;
                    break;
                }
                if (c == ')') {
                    stack.pop();
                }
            }
            if (stack.isEmpty() && flag == 0) {
                System.out.println('1');
            } else {
                System.out.println('0');
            }
        }
    }
}
