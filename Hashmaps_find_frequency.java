import java.util.*;
public class Hashmaps_find_frequency{
    public static void main(String[] args){
        HashMap <Integer,Integer> map = new HashMap<>();
        int arr[]={2,3,4,3,4,2};
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            else{
                map.put(num,1);
            }
        }
        System.out.println(map);
    }
}