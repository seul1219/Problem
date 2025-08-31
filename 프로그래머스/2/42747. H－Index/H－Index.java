class Solution {
    public int solution(int[] citations) {
        int answer = 0;
     
        int len = citations.length;
        int cnt = 0;
        while(len>=0) {
            for(int i=0; i<citations.length; i++) {
                if(citations[i]>=len) {
                    cnt++;
                }
            }
            
            if(cnt>=len) {
                answer = len;
                break;
            } else {
                cnt=0;
                len--;
            }
        }
        
        return answer;
    }
}