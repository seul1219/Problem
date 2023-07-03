import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

   public static void main(String args[]) throws IOException { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     StringTokenizer st = new StringTokenizer(br.readLine());
     
     int N = Integer.parseInt(st.nextToken());
     int M = Integer.parseInt(st.nextToken());

     int[] ball = new int[N+1];
     
     for(int i=0; i<M; i++) {
       StringTokenizer st2 = new StringTokenizer(br.readLine());

       int a = Integer.parseInt(st2.nextToken());
       int b = Integer.parseInt(st2.nextToken());
       int c = Integer.parseInt(st2.nextToken());

       for(int j=a; j<=b; j++) {
    	   ball[j] = c;
       }
     }
     
     StringBuilder sb = new StringBuilder();
     for(int i=1; i<N+1; i++) {
       sb.append(ball[i]).append(" ");
     }

     System.out.println(sb.toString());
   }
}