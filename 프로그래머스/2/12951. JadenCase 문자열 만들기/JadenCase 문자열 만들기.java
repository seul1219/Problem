class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        
        if (c[0]>='a' && c[0]<='z') {
            c[0] = (char) (c[0]-32);
        }
        
        for(int i=1; i<c.length; i++) {
            if(c[i-1]==' ') {
                if(c[i]>='a' && c[i]<='z') {
                    c[i] = (char) (c[i]-32);
                }
            } else {
                if(c[i]>='A' && c[i]<='Z') {
                    c[i] = (char) (c[i]+32);
                }
            }   
        }
        
        String answer = "";
        for(int i=0; i<c.length; i++) {
            answer += c[i];
        }
        
        return answer;
    }
}