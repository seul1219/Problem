import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
   public static void main(String args[]) throws IOException { 
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     int T = Integer.parseInt(br.readLine());
     
     for(int t=0; t<T; t++) {
	     StringTokenizer st = new StringTokenizer(br.readLine());
	     int cnt = st.countTokens();
	     Queue<String> que = new LinkedList<>();     
	     for(int i=0; i<cnt; i++) {
	       que.offer(st.nextToken());
	     }
	     
	     ArrayList<String> list = new ArrayList<>();
	     StringBuilder sb = new StringBuilder();

	     while(true) {
		     String str = br.readLine();
		     if(str.equals("what does the fox say?")) {
		    	 break;
		     } else {
		    	 StringTokenizer st2 = new StringTokenizer(str);
		         String animal = st2.nextToken();
		         String goes = st2.nextToken();
		         String sound = st2.nextToken();
		       
		         list.add(sound);
		      }
	     }
	     
	     while(!que.isEmpty()) {
	    	 String cur = que.peek();
	    	 
	    	 boolean flag = false;
	    	 for(int j=0; j<list.size(); j++) {
	    		 if((list.get(j)).equals(cur)) {
	    			 flag = true;
	    			 break;
	    		 }
	    	 }
	    	 
	    	 String s = que.poll();
	    	 if(!flag) {
	    		 sb.append(s).append(" ");
	    	 } 
	     }
	      
	      System.out.println(sb.toString());      
	   }
   }
}