public class Main {
    public static void main(String[] args) {
        MyQueue m  =new MyQueue();
        m.enQueue(1);
        m.enQueue(2);
        m.enQueue(3);
        m.enQueue(4);
        m.enQueue(5);
        m.enQueue(5);
        System.out.println(m.deQueue());
        m.deQueue();
        while(!m.isEmpty()){
            System.out.println(m.peek());
            m.deQueue();
        }
    }
}