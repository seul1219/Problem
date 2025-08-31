import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<int[]> que = new LinkedList<>();
        for(int i=0; i<progresses.length; i++) {
            que.offer(new int[] {i, progresses[i], 0});
        }
        
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        int idx = 0;
        while(!que.isEmpty()) {
            int[] cur = que.poll();
            
            //완료된 작업인데
            if(cur[2]==1) {
                //앞순서가 남아 있으면
                if(idx<cur[0]) {
                    que.offer(new int[] {cur[0], 100, 1});
                    
                } else {
                    cnt++;    
                    idx++;
                } 
            } else {
                //배포하고
                if(cnt>0) {
                    list.add(cnt);
                    cnt=0;   
                }
             
                if(cur[1]<100) {
                    que.offer(new int[] {cur[0], cur[1]+speeds[cur[0]], 0});
                } else {
                    que.offer(new int[] {cur[0], 100, 1});
                }
            }
        }
        
        //남은 것 처리
        if(cnt>0) {
            list.add(cnt);
            cnt=0;   
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }   
        
        return answer;
    }
}