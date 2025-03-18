class Solution {
    public int solution(String s) {
        
        int answer = 0;  
        
        boolean minus = false;
        //부호 확인
        if(s.charAt(0)=='-') {
            minus = true;
            
            String s2 = "";
            for(int i=1; i<s.length(); i++) {
                s2 += s.charAt(i);
            }
            
            answer = Integer.parseInt(s2);
            answer = 0 - answer;
            
        } else if(s.charAt(0)=='+') {
            String s2 = "";
            for(int i=1; i<s.length(); i++) {
                s2 += s.charAt(i);
            }
            
            answer = Integer.parseInt(s2);
        } else {
            answer = Integer.parseInt(s);
        }
       
        return answer;
    }
}