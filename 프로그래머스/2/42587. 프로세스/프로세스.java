import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> que = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<priorities.length; i++) {
            que.offer(i);
            list.add(priorities[i]);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        int idx = 0;
        while(!que.isEmpty()) {
            int cur = que.poll();
            
            if(priorities[cur]<list.get(idx)) {
                que.offer(cur);
            } else {
                if(cur==location) {
                    answer = idx+1;
                }
                
                idx++;
            }
        }
        
        return answer;
    }
}