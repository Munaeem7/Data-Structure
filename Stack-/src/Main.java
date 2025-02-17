public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(11);
        s.push(19);
        s.push(18);
       // s.pop();
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println();
        s.pop();
    }
}