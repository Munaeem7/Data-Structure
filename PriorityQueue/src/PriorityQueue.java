public class PriorityQueue {
    private int arr[];
    private int size;
    private int back;
    private int front;

    public PriorityQueue(int s){
        this.size= s;
        arr = new int[s];
        back = -1;
        front = -1;
    }

    // to check if queue is empty
    public boolean isEmpty() {
        return back == -1 && front == -1;
    }

    // to check if queue is full
    public boolean isFull() {
        return back == size - 1;
    }

    // to add in queue
    public void Enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            if(isEmpty()){
                front = 0;
            }
            arr[++back] = data;
        }
    }

    // to remove highest priority element
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else{
            int maxIndex = front;
            // to find max index
            for(int i = front; i <= back; i++){
                if(arr[i] > arr[maxIndex]){
                    maxIndex = i;
                }
            }

            int result = arr[maxIndex];
            //to remove max index
            for(int i = maxIndex; i < back; i++){
                arr[i] = arr[i+1];
            }
            back--;

            if(isEmpty()){
                front = back = -1;
            }
            return result;
        }

    }

    // to see highest priority element
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else{
            int maxindex = front;
            for(int i = front; i <= back ; i++){
                if(arr[i] > arr[maxindex]){
                    maxindex = i;
                }
            }
            return arr[maxindex];
        }
    }

    // to display all
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            for(int i = 0; i <=back; i++){
                System.out.println(arr[i]);
            }
        }
    }
}
