import java.util.*;
class Solution {
    public static int[] sel;
    public static boolean[] visited;
    public static List<int[]> list = new ArrayList<>();
    
    public static int solution(int k, int[][] dungeons) {
        int len = dungeons.length;
        sel = new int[len];
        visited = new boolean[len];
        
        select(len, 0);
        
        int max = -1;
        for(int i=0; i<list.size(); i++) {
            int[] cur = list.get(i);
            int start = k;
            int cnt = 0;
            for(int j=0; j<cur.length; j++) {
                //던전을 돌 수 있는 상태인지 확인
                if(start>=dungeons[cur[j]][0]) {
                    start -= dungeons[cur[j]][1];
                    cnt++;
                } else {
                    break;
                }
            }
            
            max = Math.max(cnt, max);
        }
        return max;
    }
    
    public static void select(int len, int cnt) {
        if(cnt==len) {
            int[] copy = new int[len];
            for(int i=0; i<len; i++) {
                copy[i] = sel[i];
            }
            list.add(copy);
            return;
        } else {
            for(int i=0; i<len; i++) {
                if(!visited[i]) {
                    sel[cnt] = i;
                    visited[i] = true;
                    select(len, cnt+1);
                    visited[i] = false;
                }
            }
        }
    }
}