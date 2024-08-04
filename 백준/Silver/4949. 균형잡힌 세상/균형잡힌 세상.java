import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str;
        
        while (true) {
            str = sc.nextLine();
            
            if (str.equals(".")) { 
                break;
            }
            
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i); // i 번째 문자 
                
                // 여는 괄호일 경우 스택에 push 
                if (c == '(' || c == '[') {
                    stack.push(c);
                }
                
                // 닫는 소괄호일 경우
                else if (c == ')') {
                    // ( 없는 경우
                    if (stack.empty() || stack.peek() != '(') {
                        isValid = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
                
                else if (c == ']') {
                    // [ 없는 경우
                    if (stack.empty() || stack.peek() != '[') {
                        isValid = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
                
            }
            
            if (isValid && stack.empty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        
    }
}
