import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    public static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int K = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        
        int[][] map = new int[H][W];
        for(int r=0; r<H; r++) {
            st = new StringTokenizer(br.readLine());
            for(int c=0; c<W; c++) {
                map[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        
        //원숭이는 (0, 0) -> (H-1, W-1)
        //나이트처럼(K번) + 상하좌우 움직임 가능
        //0으로만 움직임, 1로는 갈 수 없음
        
        //원숭이
        int[] mdr = {-1, 1, 0, 0};
        int[] mdc = {0, 0, -1, 1};
        
        //나이트
        int[] ndr = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] ndc = {-1, 1, -2, 2, -2, 2, -1, 1};
        
//        int[] dr = {-1, 1, 0, 0, -2, -2, -1, -1, 1, 1, 2, 2};
//        int[] dc = {0, 0, -1, 1, -1, 1, -2, 2, -2, 2, -1, 1};

        //3차원으로 나이트 방문 체크
        boolean[][][] visited = new boolean[H][W][K+1];
        Queue<int[]> que = new LinkedList<>();
        //이동 좌표/방문 횟수/나이트 사용 횟수
        que.offer(new int[] {0, 0, 0, 0});
        visited[0][0][0] = true;
        boolean flag = false;
        int ans = Integer.MAX_VALUE;
        
        while(!que.isEmpty()) {
            int[] cur = que.poll();
            
            if(cur[0]==H-1 && cur[1]==W-1) {
                flag = true;
                ans = Math.min(ans, cur[2]);
            }
            
            //원숭이
            for(int d=0; d<4; d++) {
                int nr = cur[0] + mdr[d];
                int nc = cur[1] + mdc[d];
                
                if(nr>=0 && nr<H && nc>=0 & nc<W && map[nr][nc]==0 && !visited[nr][nc][cur[3]]) {
            		//원숭이
            		if(d>=0 && d<4) {
            			que.offer(new int[] {nr, nc, cur[2]+1, cur[3]});
            			visited[nr][nc][cur[3]] = true;
            		}
            	}
            }
            
    		//나이트
            if(cur[3]<K) {
            	for(int d=0; d<8; d++) { 
	            	int nr = cur[0] + ndr[d];
	                int nc = cur[1] + ndc[d];
	                
	            	if(nr>=0 && nr<H && nc>=0 & nc<W && map[nr][nc]==0 && !visited[nr][nc][cur[3]+1]) {
        				que.offer(new int[] {nr, nc, cur[2]+1, cur[3]+1});
        				visited[nr][nc][cur[3]+1] = true;
        			}
                }
            }
        }
        
        if(flag) {
            System.out.println(ans);
        } else {
            System.out.println("-1");
        }
    }
}