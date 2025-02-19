import java.util.Stack;
import java.util.concurrent.ScheduledExecutorService;

public class Util {
    public int precedance(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    };

    public String infixtoPostfix(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                output.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while(!stack.isEmpty() && stack.peek() != '('){
                    output.append(stack.pop());
                }
                stack.pop();
            }else{
                while (!stack.isEmpty() && precedance(stack.peek()) >= precedance(ch)){
                    output.append(stack.pop());
                }
                stack.push(ch);
            }

        }
        while(!stack.isEmpty()){
            output.append(stack.pop());
        }

        return output.toString();
    }
}
