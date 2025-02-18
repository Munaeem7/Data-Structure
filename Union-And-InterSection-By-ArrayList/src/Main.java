import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2,5,9,2,14,15,7,20,17,30));
        ArrayList<Integer> B= new ArrayList<>(Arrays.asList(14,2,9,13,37,8,7,28));

//        for(Integer a : A){
//            if(B.contains(a)){
//                C.add(a);
//            }
//        }
        System.out.println("Intersection : "+ Intersection(A,B));
        System.out.println("Union : "+union(A,B));;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> L1 , ArrayList<Integer> L2){
        ArrayList<Integer> res = new ArrayList<>();
        for(Integer a : L1){
            if(!res.contains(a)){
                res.add(a);
            }
        }
        for(Integer b : L2){
            if(!res.contains(b)){
                res.add(b);
            }
        }
        return res;
    }

    public static List<Integer> Intersection(List<Integer> A , List<Integer> B){
        List<Integer> C = new ArrayList<>();
        for(Integer a : A){
            for(Integer b : B){
                if(a == b && !C.contains(a)){
                    C.add(a);
                    break;
                }
            }
        }
        return C;
    }
}