import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
	  
public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int[] arr = new int[4];
		String name = br.readLine();
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)=='L') {
				arr[0]++;
			} else if(name.charAt(i)=='O') {
				arr[1]++;
			} else if(name.charAt(i)=='V') {
				arr[2]++;
			} else if(name.charAt(i)=='E') {
				arr[3]++;
			} 
		}
		
		int num = Integer.parseInt(br.readLine());
		String[] names = new String[num];
		int[][] arr2 = new int[num][4];
		for(int i=0; i<num; i++) {
			names[i] = br.readLine();
			for(int j=0; j<names[i].length(); j++) {
				if(names[i].charAt(j)=='L') {
					arr2[i][0]++;
				} else if(names[i].charAt(j)=='O') {
					arr2[i][1]++;
				} else if(names[i].charAt(j)=='V') {
					arr2[i][2]++;
				} else if(names[i].charAt(j)=='E') {
					arr2[i][3]++;
				} 
			}
		}
		
		int max = 0;
		int[] marks = new int[num];
		for(int i=0; i<num; i++) {
			int L = arr[0] + arr2[i][0];
			int O = arr[1] + arr2[i][1];
			int V = arr[2] + arr2[i][2];
			int E = arr[3] + arr2[i][3];
			
			int mark = ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E))%100;
			
			marks[i] = mark;
			
			if(max<mark) {
				max = mark;
			}
		}
		
		PriorityQueue<String> que = new PriorityQueue<>(); 
		for(int i=0; i<num; i++) {
			if(max==marks[i]) {
				que.offer(names[i]);
			}
		}
		
		System.out.println(que.poll());
	}
}
