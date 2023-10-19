import java.util.*;
class Solution {
    public int[] solution(int n) {
        //이동방향
        int[] dr = {1, 0, -1};
        int[] dc = {0, 1, -1};
        //각 방향 당 채워야 할 개수
        //하나씩 줄어들게
        int max = n;
        
        int[][] map = new int[n][n];
        int d = 0;
        int sr = -1;
        int sc = 0;
        int num = 1;
        while(max!=0) {
            for(int i=0; i<max; i++) {
                 sr = sr + dr[d%3];
                 sc = sc + dc[d%3];
                if(sr>=0 && sc>=0 && sr<n && sc<n) {
                    map[sr][sc] = num++;
                }
            }
            d++;
            max--;
        }
        
        // for(int r=0; r<n; r++) {
        //     for(int c=0; c<n; c++) {
        //         System.out.print(map[r][c] + " ");
        //     }
        //     System.out.println();
        // }
        
        List<Integer> list = new ArrayList<>();
        for(int r=0; r<n; r++) {
            for(int c=0; c<n; c++) {
                if(map[r][c]!=0) {
                    list.add(map[r][c]);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int i=0; i<list.size(); i++) {
            answer[cnt++] = list.get(i);
        }
        return answer;
    }
}