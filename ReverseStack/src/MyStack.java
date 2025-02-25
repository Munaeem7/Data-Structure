import java.util.Stack;
public class MyStack {

    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int n = s.pop();
        pushAtBottom(data, s);
        s.push(n);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int num = s.pop();
        reverse(s);
        pushAtBottom(num,s);
    }
}
