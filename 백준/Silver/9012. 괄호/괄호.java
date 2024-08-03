import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String str = br.readLine();
			
			Stack<Character> stack = new Stack<Character>();
			
			for(int j = 0; j < str.length(); j++) {
                // 여는 괄호일 경우 스택에 넣음
				if(str.charAt(j) == '(') {
					stack.push(str.charAt(j)); 
				}
                
                // 닫는 괄호일 경우 )
                else {
					if(stack.empty()) { // (가 없다면
						stack.push(str.charAt(j)); // 닫는 괄호 스택에 ) 저장
						break;
					}
                    else {
						stack.pop(); // (가 있다면 성립하는거라 stack에서 꺼냄
					}
				}
			}
            // 결과
			if(stack.empty()) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}