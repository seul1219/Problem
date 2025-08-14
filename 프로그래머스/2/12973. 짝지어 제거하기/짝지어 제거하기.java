import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(st.isEmpty()) {
                st.push(c);
            } else {
                if(st.peek()==c) {
                    st.pop();
                } else {
                   st.push(c); 
                }    
            }
        }
        
        if(st.isEmpty()) {
            answer = 1;
        }
        
        return answer;
    }
}