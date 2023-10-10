import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int N = nums.length/2;
        int cnt = 0;
        boolean[] visited = new boolean[200001];
        for(int num : nums) {
            if(!visited[num]) {
                visited[num] = true;
                cnt++;
            }
        }
    
        int ans = 0;
        if(cnt>N) {
            ans = N;
        } else if(cnt<=N) {
            ans = cnt;
        }
        
        return ans;
    }
}