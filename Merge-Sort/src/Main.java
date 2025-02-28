public class Main {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        Sort s = new Sort();
        s.divide(arr , 0 , arr.length - 1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}