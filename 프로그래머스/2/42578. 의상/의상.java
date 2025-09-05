import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++) {
            if(map.containsKey(clothes[i][1])) {
                int cur = map.get(clothes[i][1]);
                map.put(clothes[i][1], cur+1);
            } else {
                map.put(clothes[i][1], 1);
            }
        }
        
        int answer = 1;
        for(String key : map.keySet()) {
            int cur = map.get(key);
            answer *= (cur+1);
        }
        answer-=1;
        
        return answer;
    }
}