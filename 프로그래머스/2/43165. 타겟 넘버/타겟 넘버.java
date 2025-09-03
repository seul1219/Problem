import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[] {0, 0});
        
        while(!que.isEmpty()) {
            int[] cur = que.poll();
            if(cur[0]==target && cur[1]==numbers.length) {
                answer++;
            }
            
            if(cur[1]<numbers.length) {
                que.offer(new int[] {cur[0]+numbers[cur[1]], cur[1]+1});
                que.offer(new int[] {cur[0]+numbers[cur[1]]*-1, cur[1]+1});        
            }
        }
        
        return answer;
    }
}