import java.io.*;
import java.util.*;

public class Main {
   public static void main(String args[]) throws IOException { 
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     int T = Integer.parseInt(br.readLine());
     StringBuilder sb = new StringBuilder();
     for(int i=0; i<T; i++) {
       int n = Integer.parseInt(br.readLine());
       
       sb.append("Pairs for ").append(n).append(": ");
       int cnt = 1;
       int mid = n/2;
       if(n%2==0) {
         while(cnt<mid) {
           if(cnt!=1) {
             sb.append(", ");
           }
           sb.append(cnt).append(" ").append(n-cnt);
           cnt++;
         }
       } else {
         while(cnt<=mid) {
           if(cnt!=1) {
             sb.append(", ");
           }
           sb.append(cnt).append(" ").append(n-cnt);
           cnt++;
         }
       }
       
       sb.append("\n");
     }
     
     System.out.println(sb.toString());
   }
}