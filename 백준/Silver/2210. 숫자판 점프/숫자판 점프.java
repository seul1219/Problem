import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static int[][] map = new int[5][5];
	public static int[] dr = {-1, 0, 1, 0};
	public static int[] dc = {0, -1, 0, 1};
	public static Set<String> set = new HashSet<String>();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int r=0; r<5; r++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int c=0; c<5; c++) {
				map[r][c] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int r=0; r<5; r++) {
			for(int c=0; c<5; c++) {
				dfs(r, c, 1, String.valueOf(map[r][c]));
			}
		}
		
		System.out.println(set.size());
	}

	public static void dfs(int r, int c, int cnt, String val) {
		if (cnt == 6) {
            set.add(val);
            return;
        }

        for (int d=0; d<4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr >= 0 && nr < 5 && nc >= 0 && nc < 5) {
                dfs(nr, nc, cnt + 1, val + map[nr][nc]);
            }
        }
	}
}