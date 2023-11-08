import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Long> que = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++) {
            que.offer(Long.valueOf(scoville[i]));
        }
        
        int cnt = 0;
        boolean flag = false;
        while(!que.isEmpty()) {
            Long min1 = que.poll();
            
            if(min1>=K || que.size()==0) {
                break;
            }
            
            if(que.size()==0 && min1<K) {
                flag = true;
                break;
            }
            
            Long min2 = que.poll();
            Long next = min1 + min2*2;
            
            if(que.size()==0 && next<K) {
                flag = true;
                break;
            }
            
            cnt++;
            que.offer(next); 
        }
        
        int answer = -1;
        if(!flag) {
            answer = cnt;
        } 
        return answer;
    }
}