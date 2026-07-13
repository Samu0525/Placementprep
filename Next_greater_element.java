import java.util.*;
public class Next_greater_element{
    public static int[] A(int[] arr){
        int ans[]=new int[arr.length];
        Stack<Integer> sc=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            int currentelement=arr[i];
            
        while(!sc.isEmpty() && sc.peek() <= currentelement){
            sc.pop();
        }
       
        if (sc.isEmpty()) {
            ans[i] = -1;
        } else {
            ans[i] = sc.peek();
        }
        sc.push(currentelement);
    }
    
    return ans;    
    }
    public static void main(String[] args){
        int arr[]={2, 1, 5, 3, 4};
        int result[]=A(arr);
        System.out.println(Arrays.toString(result));
        
    }
}