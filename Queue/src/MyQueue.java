public class MyQueue {
  int arr[];
  int back ;

  public MyQueue(){
      arr = new int[5];
      back = -1;
  }

  public boolean isEmpty(){
      return back == -1;
  }

  public void enQueue(int data){
      if(back == arr.length -1){
          System.out.println("Queue is full");
      }else {
          back++;
          arr[back] = data;
      }
  }

  public int deQueue(){
      if(isEmpty()){
          System.out.println("queue is empty");
          return -1;
      }
      int front = arr[0];
      for(int i=0;i<arr.length-1;i++){
          arr[i] = arr[i+1];
      }
      back--;
      return front;
  }

  public int peek(){
      if(isEmpty()){
          System.out.println("queue is empty");
          return -1;
      }
      return arr[0];
  }
}
