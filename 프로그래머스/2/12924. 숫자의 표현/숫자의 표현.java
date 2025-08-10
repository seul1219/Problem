class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
            int start = i;
            int sum = 0;
            for(int j=start; j<=n; j++) {
                sum += j;
                
                if(sum==n) {
                    answer += 1;
                } else if(sum>n) {
                    break;
                }
            }
        }
        
        return answer;
    }
}