import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Queue<Integer> que = new LinkedList<>();
        
        for(int i=0; i<prices.length; i++) {
            que.offer(prices[i]);
        }
        
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        while(!que.isEmpty()) {
            //비교할 시점
            int cur = que.poll();
            cnt++;
            
            boolean flag = false;
            for(int i=cnt; i<prices.length; i++) {
                if(cur>prices[i]) {
                    list.add(i-cnt+1);
                    flag = true;
                    break;
                }
            }
            
            if(!flag) {
                list.add(prices.length-cnt);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}