import java.io.*;
import java.util.*;

public class Main {
   public static void main(String args[]) throws IOException { 
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st = new StringTokenizer(br.readLine());
     
     int N = Integer.parseInt(st.nextToken());
     int X = Integer.parseInt(st.nextToken());
     
     int[] arr = new int[N];
     StringTokenizer st2 = new StringTokenizer(br.readLine());
     for(int i=0; i<N; i++) {
       arr[i] = Integer.parseInt(st2.nextToken());
     }
     
     int min = Integer.MAX_VALUE;
     for(int i=0; i<N-1; i++) {
       min = Math.min(min, arr[i]*X + arr[i+1]*X);
     }
     
     System.out.println(min);
    }
 }