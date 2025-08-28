class Solution {
    public int cnt0 = 0;
    
    public int[] solution(String s) {
        int cnt = 0;
        
        while(!s.equals("1")) {
            s = make2(s);
            cnt++;
        }
        
        int[] answer = {cnt, cnt0};
        return answer;
    }
    
    public String make2(String s) {
        //0 제거
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c!='0') {
                sb.append(c);
            } else {
                cnt0++;
            }
        }
        
        //길이
        int len = sb.length();
        
        //이진 변환
       sb = new StringBuilder();
        while(len>0) {
            if(len%2==1) {
                sb.append('1');
            } else {
                sb.append('0');
            }
            len/=2;
        }
        
        String ans = sb.reverse().toString();
        
        return ans;
    }
}