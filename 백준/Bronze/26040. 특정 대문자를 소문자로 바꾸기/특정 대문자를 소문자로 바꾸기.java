import java.io.*;

public class Main {
   public static void main(String args[]) throws IOException { 
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     String str = br.readLine();
     String str2 = br.readLine();
     
     boolean[] visited = new boolean[26];
     for(int i=0; i<str2.length(); i++) {
       char cur = str2.charAt(i);
       if(cur!=' ') {
    	 int th = (int) (cur-65);
         visited[th] = true;
       }
     }
     
     StringBuilder sb = new StringBuilder();
     for(int i=0; i<str.length(); i++) {
       char cur = str.charAt(i);
       if(cur>=65 && cur<=90) {
         int th = (int) (cur-65);
         if(visited[th]) {
           int th2 = (int)(cur+32);
           char next = (char) (th2); 
           sb.append(next);
         } else {
           sb.append(cur);
         }
       } else {
         sb.append(cur);
       }
     }
     
     System.out.println(sb.toString());
     
   }
}