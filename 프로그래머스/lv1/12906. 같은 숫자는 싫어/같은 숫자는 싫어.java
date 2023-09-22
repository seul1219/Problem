import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        Queue<Integer> que = new LinkedList<>();
        for(int i=0; i<arr.length; i++) {
            que.offer(arr[i]);
        }
        
        int cur = que.poll();
        list.add(cur);
        
        while(!que.isEmpty()) {
            int next = que.poll();
            
            if(cur!=next) {
                list.add(next);
                cur = next;
            } 
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
            
        return answer;
    }
}