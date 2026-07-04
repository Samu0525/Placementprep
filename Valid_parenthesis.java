import java.util.*;
 class Valid_parenthesis{
    public static void  validparenthesis(String str){
        Stack<Character> sc=new Stack<>();
        
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[' ){
                sc.push(str.charAt(i));
            }else{
                if((sc.peek()=='('&& str.charAt(i)==')')){
                    
                    sc.pop();
                }else if( (sc.peek()=='['&& str.charAt(i)==']')||
            (sc.peek()=='{'&& str.charAt(i)=='}')
            ){sc.pop();
                }
            }
        }
        if(sc.isEmpty()){
            System.err.println("Valid");
        }else{
            System.err.println("Invalid");
        }
    }
public static void main (String[] args){

validparenthesis("[()]");
validparenthesis("[()]{}");
}

}