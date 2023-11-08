import java.util.*;
class Solution {
    public static boolean[][] visited;
    public static int lenr;
    public static int lenc;
    public static int[] dr = {-1, 0, 1, 0};
    public static int[] dc = {0, -1, 0, 1};
    public static int[][] map;
    
    public static int[] solution(String[] maps) {
        lenr = maps.length;
        lenc = maps[0].length();
        visited = new boolean[lenr][lenc];
        map = new int[lenr][lenc];
        for(int r=0; r<lenr; r++) {
            String tmp = maps[r];
            for(int c=0; c<lenc; c++) {
                char ch = tmp.charAt(c);
                if(ch=='X') {
                    map[r][c] = 0;
                } else {
                    map[r][c] = (int) ch-'0';
                }
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(int r=0; r<lenr; r++) {
            for(int c=0; c<lenc; c++) {
                if(map[r][c]!=0 && !visited[r][c]) {
                    int res = move(r, c);
                    list.add(res);
                }
            }
        }
        
        int[] answer;
        
        if(list.size()==0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
           answer = new int[list.size()];
            for(int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
    
    public static int move(int r, int c) {
        Queue<int[]> que = new LinkedList<>();
        visited[r][c] = true;
        int ans = map[r][c];
        que.offer(new int[] {r, c});
        
        while(!que.isEmpty()) {
            int[] cur = que.poll();
            
            for(int d=0; d<4; d++) {
                int nr = cur[0] + dr[d];
                int nc = cur[1] + dc[d];
                
                if(nr>=0 && nr<lenr && nc>=0 && nc<lenc) {
                    if(!visited[nr][nc] && map[nr][nc]!=0) {
                        ans += map[nr][nc];
                        visited[nr][nc] = true;
                        que.offer(new int[] {nr, nc});
                    }
                }
            }
        }
        
        return ans;
    }
}