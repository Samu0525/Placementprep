import java.util.*;
public class Valid_anagram {
    public static void anagram(String str, String str2){
        //Set<Character> s=new Set<>();--> Uding set is not the right approach.
        int frequency[]=new int[26];
            if(str.length()!=str2.length()){
                return ;
            }
            else{
                 for(int i=0;i<str.length();i++){
                    frequency[str.charAt(i)-'a']++;
                }
                for(int j=0;j<str2.length();j++){
                    frequency[str2.charAt(j)-'a']--;
                }
            }
            for(int i=0;i<frequency.length;i++){
                if(frequency[i]>0|| frequency[i]<0){
                   System.out.println("invalid");
                   return;
                }
            }
            System.out.println("valid");
   
        

    }
   public static void main(String[]args){
    String str="listen";
    String str2="silent";
    anagram(str, str2);
   }
}
