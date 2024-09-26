import java.util.*;
class ValidParentheses{
    public static void main(String[] args){
      boolean match(char a, char b){
        if((a == '(' && b == ')') || (a== '{' && b== '}') || (a == '[' && b== ']'))
        return true;
        else
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>
        ();
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '[' || arr[i] == '(' || arr[i] == '{'){
                st.push(arr[i]);
            }
            else{
                if(st.isEmpty() || match(st.peek(), arr[i]) == false){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}}