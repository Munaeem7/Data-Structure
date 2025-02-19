import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(Arrays.asList(2,5,9,14,15,7,20,17,30));
        List<Integer> B = new ArrayList<>(Arrays.asList(14,2,9,13,37,8,7,28));

        Stack<Integer> s1 = new Stack<>();
        for(int i = 0; i <A.size(); i++){
            s1.push(A.get(i));
        }
        Stack s2 = new Stack<>();
        for(int i = 0; i <B.size(); i++){
            s2.push(B.get(i));
        }
        System.out.println(s1);
        System.out.println(s2);
        Stack<Integer> res = new Stack<>();


        while(!s2.isEmpty() && !s1.isEmpty()){
            int el1 = s1.pop();
            if(s2.contains(el1)){
                res.push(el1);
            }

        }

        System.out.println(res);

    }
}