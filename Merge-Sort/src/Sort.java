public class Sort {
    public void divide(int[] arr , int l , int r){
        if(l < r){
            int mid = (l + r) / 2;
            divide(arr , l , mid);
            divide(arr , mid + 1 , r);
            conquer(arr , mid , l , r);
        }
    }
    public void conquer(int[] arr , int mid , int l , int r){
        int[] merged = new int[r - l + 1];

        int idx1 = l;
        int idx2 = mid + 1;
        int x = 0;

        while(idx1 <= mid && idx2 <= r){
            if(arr[idx1] < arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= r){
            merged[x++] = arr[idx2++];
        }

        for(int i = 0, j = l ; i < merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }
}
