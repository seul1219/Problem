import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String args[]) throws IOException { 
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     StringTokenizer st = new StringTokenizer(br.readLine());
    
     int N = Integer.parseInt(st.nextToken());
     int H = Integer.parseInt(st.nextToken());
     int T = Integer.parseInt(st.nextToken());
     
     PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
     for(int i=0; i<N; i++) {
       int num = Integer.parseInt(br.readLine());
       que.offer(num);
     }
     
     int cnt = 0;
     int cnt1 = T;
     boolean check = false;
     while(!que.isEmpty() && cnt!=T) {
       int num2 = que.poll();
       if(!check && num2<H) {
    	 cnt1 = cnt;
    	 check = true;
       }
       
       if(num2!=1) {
    	 que.offer(num2/2);
       } else if(num2==1) {
    	 que.offer(num2);
       }
       
       cnt++;
     }
     
     boolean flag = false;
     int num4 = 0;
     int cnt2 = 0;
     while(!que.isEmpty()) {
       if(cnt2==0) {
         num4 = que.peek();
       }
       
       int num3 = que.poll();
       if(num3>=H) {
         flag = true;
       }
       
       cnt2++;
     }
    
     if(flag) {
       System.out.println("NO");
       System.out.println(num4);
     } else {
       System.out.println("YES");
       System.out.println(cnt1);
     }
    }
 }