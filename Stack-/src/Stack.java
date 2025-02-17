public class Stack {
    int tos ;
    int[] arr;

    public Stack() {
        tos = -1;
        arr = new int[5];
    }

    public boolean isEmpty(){
        return tos == -1;
    }

    public void push(int data){
        if(tos == arr.length - 1){
            System.out.println("full..");
        }else{
            tos++;
            arr[tos] = data;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Empty.");
            return -1;
        }
        return arr[tos--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return arr[tos];
    }



}
