import java.util.*;
class Solution {
    public int answer = 0;
    public boolean flag = false;
    public int solution(String s) {
        //회전
        for(int i=0; i<s.length(); i++) {
            String str = "";
            for(int j=i; j<s.length(); j++) {
                str += s.charAt(j);
            }
            for(int j=0; j<i; j++) {
                str += s.charAt(j);
            }
            test(str);
        }

        return answer;
    }
    
    //올바른지
    public void test(String str) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char cur = str.charAt(i);
            if(cur=='(' 
              || cur=='['
              || cur=='{') {
                st.push(cur);
                flag = true;
            } else {
                if(!st.isEmpty()) {
                    char before = st.peek();
                    if((cur==')' && before=='(')
                        || (cur==']' && before=='[')
                        || (cur=='}' && before=='{')) {
                       st.pop(); 
                    }    
                }
            }
        }
        
        if(st.isEmpty() && flag) {
            answer++;
        }
    }
}