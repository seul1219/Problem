import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = Integer.MAX_VALUE;
        
        int n = maps.length;
        int m = maps[0].length;
        
        boolean[][] visited = new boolean[n][m];
        int[] dr = {0, 0, -1, 1};
        int[] dc = {-1, 1, 0, 0};
        
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[] {0, 0, 1});
        visited[0][0] = true;

        while(!que.isEmpty()) {
            int[] cur = que.poll();
            
            if(cur[0]==n-1 && cur[1]==m-1) {
                answer = Math.min(cur[2], answer); 
            }
            
            for(int d=0; d<4; d++) {
                int nr = cur[0] + dr[d];
                int nc = cur[1] + dc[d];
                
                if(nr>=0 && nr<n && nc>=0 && nc<m) {
                    if(maps[nr][nc]==1 && !visited[nr][nc]) {
                        visited[nr][nc] = true;
                        que.offer(new int[] {nr, nc, cur[2]+1});
                    }
                }
            }
        }
        
        if(answer!=Integer.MAX_VALUE) {
            return answer;
        } else {
            return -1;   
        }
    }
}