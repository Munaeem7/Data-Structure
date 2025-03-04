import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(Arrays.asList(2,5,9,14,15,7,20,17,30));
        List<Integer> B = new ArrayList<>(Arrays.asList(14,2,9,13,37,8,7,28));
        Stack<Integer> s1 = new Stack<>();
        for(int i = A.size()-1; i >= 0; i--){
            s1.push(A.get(i));
        }
        Stack<Integer> s2 = new Stack<>();
        for(int i = B.size()-1; i >=0; i--){
            s2.push(B.get(i));
        }
        System.out.println(s1);
        System.out.println(s2);
        Stack<Integer> res = new Stack<>();

        while(!s1.isEmpty()){
            int el = s1.pop();
            if(!res.contains(el)){
                res.push(el);
            }
        }
        while(!s2.isEmpty()){
            int el = s2.pop();
            if(!res.contains(el)){
                res.push(el);
            }
        }

        System.out.println(res);
    }
}