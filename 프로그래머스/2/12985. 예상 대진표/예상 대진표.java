import java.util.*;
class Solution
{
    public int solution(int n, int a, int b)
    {
        Queue<int[]> que = new LinkedList<>();
        
        int[][] par = new int[n+1][3];
        for(int i=1; i<n+1; i++) {
            par[i][0] = i;
            if(i==a || i==b) {
                par[i][1] = 1;
            }
            que.offer(new int[] {par[i][0], par[i][1], 1});
        }
        
        int res = 0;
        while(!que.isEmpty()) {
            int[] cur = que.poll();
            int[] next = que.poll();
            
            if(cur[1]==0 && next[1]==0) {
                cur[2]+=1;
                que.offer(cur);
            } else if(cur[1]==1 && next[1]==0) {
                cur[2]+=1;
                que.offer(cur);
            } else if(cur[1]==0 && next[1]==1) {
                next[2]+=1;
                que.offer(next);
            } else if(cur[1]==1 && next[1]==1) {
                res = cur[2];
                break;
            }
        }

        return res;
    }
}