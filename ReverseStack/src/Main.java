import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        MyStack.reverse(s1);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }

    }
}