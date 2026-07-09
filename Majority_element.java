import java.util.*;

public class Majority_element {
    public static void A (int n ,int[] arr){
        int num=n/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){//i is the element itself, not the index.
 map.put(i, map.getOrDefault(i,0)+1);
   int frequency = map.get(i);
            if(frequency>num){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        A(n, arr);


    }

}
