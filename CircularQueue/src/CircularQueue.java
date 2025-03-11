public class CircularQueue {
    private int arr[];
    private int back ;

    public CircularQueue(int size) {
        arr = new int[size];
        back = -1;
    }

    public void enQueue(int data){
        if(back == arr.length - 1){
            System.out.println("Queue is full..");
        }else{
            back++;
            arr[back] = data;
            System.out.println("added successfully");
        }
    }

    public int deQueue(){
        int removed = arr[0];
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{

            for(int i = 0; i < back; i++){
                arr[i] = arr[i+1];
            }
            back--;
        }
        return removed;
    }

    public boolean isEmpty(){
        return back == -1;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else{
            return arr[0];
        }
    }
    public int size(){
        return arr.length;
    }
}
