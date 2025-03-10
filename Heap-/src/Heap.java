
public class Heap {
    public int insert(int[] arr , int key, int size){
        size = size + 1;
        arr[size - 1] = key;
        heapify(arr ,  size-1);
        return size;
    }
    private void heapify(int[] arr ,  int curr){

        while(curr > 0){
            int parent = (curr - 1) / 2;
            if(arr[curr] < arr[parent]){
                int temp = arr[curr];
                arr[curr] = arr[parent];
                arr[parent] = temp;
                curr = parent;
            }else{
                break;
            }
        }
    }

    public void print(int arr[] , int size){
        for(int i = 0 ; i < size ; i++){
            System.out.println(arr[i]);
        }
    }

    public void delete(int[] arr , int n){

        arr[0] = arr[n-1];
        n = n - 1;
        heapifyDown(arr , n, 0);
    }
    public void heapifyDown(int[] arr , int n, int start){
        int largest = start;
        int leftChild = 2 *start + 1;
        int rightChild = 2 *start + 2;
         if(leftChild < n && arr[leftChild] > arr[largest]){
             largest = leftChild;
         }
         if(rightChild < n && arr[rightChild] > arr[largest]){
             largest = rightChild;
         }
         if(largest != start){
             int temp = arr[n];
             arr[n] = arr[n +1];
             arr[n+1] = temp;
             heapifyDown(arr , start , 0);
         }
    }
}
