import java.util.Arrays;

public class product_of_array_exceptself {
    static int[]  A(int arr[]){
        int answer[]=new int[arr.length];
        //brute force
        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                product*=arr[j];
                }
            }
            answer[i]=product;
        }
        return answer ;
    }
  public static void main(String[] args){
    int arr[]={2,4,5,3};
   // System.out.println(Arrays.toString(A(arr)));
    //or we can do like this 
  int[] ans = A(arr);

for (int i = 0; i < ans.length; i++) {
    System.out.print(ans[i] + " ");
}
  }
  
}
