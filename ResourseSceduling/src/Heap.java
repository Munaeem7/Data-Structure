public class Heap {

    public int insertHeap(Server[] servers,int id, int capacity, int size){
        if(size >= servers.length){
            System.out.println("Heap is full..");
            return -1;
        }
        size++;
        servers[size - 1] = new Server( id , capacity);
        heapifyUp(servers , size- 1);
        return size;
    }

    public void heapifyUp(Server[] array , int curr){
        while(curr > 0){
            int parent = (curr - 1) / 2;
            if(array[curr].capacity > array[parent].capacity){
                swap(array , curr , parent);
                curr = parent;
            }else{
                break;
            }
        }
    }

    public void printHeap(Server[] arr, int size){
        for(int i = 0; i < size; i++){
            System.out.println("Server ID : "+arr[i].id+",  Capacity : "+arr[i].capacity);
        }
    }

    public int deleteHeap(Server[] array , int size){
        array[0] = array[size - 1];
        size--;
        heapifyDown(array , 0 , size);
        return size;
    }

    public void heapifyDown(Server[] array , int curr, int size){
        while(true){
            int LC = (curr * 2) + 1;
            int RC = (curr * 2) + 2;

            int greaterChild = curr;
            if(LC < size && array[LC].capacity > array[curr].capacity){
                greaterChild = LC;
            }
            if(RC < size && array[RC].capacity > array[curr].capacity){
                greaterChild = RC;
            }
            if(greaterChild == curr){
                break;
            }

            swap(array,curr, greaterChild);
            curr = greaterChild;
        }
    }

    public void swap(Server[] arr , int i , int j){
        Server temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public Server findMaxHeap(Server[] arr){
        return arr[0];
    }
}
