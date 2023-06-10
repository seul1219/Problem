import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	   public static void main(String args[]) throws IOException { 

	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	     int N = Integer.parseInt(br.readLine());

	     StringTokenizer st = new StringTokenizer(br.readLine());

	     HashSet<String> set = new HashSet<>();

	     for(int i=0; i<N; i++) {

	       String tmp = st.nextToken();

	       boolean flag = false;

	       if(tmp.contains("Cheese")) {
	    	   if(tmp.charAt(tmp.length()-1)=='e'
	    			   && tmp.charAt(tmp.length()-2)=='s'
	    			   && tmp.charAt(tmp.length()-3)=='e'
	    			   && tmp.charAt(tmp.length()-4)=='e'
	    			   && tmp.charAt(tmp.length()-5)=='h'
	    			   && tmp.charAt(tmp.length()-6)=='C') {

	    		   		flag = true;
	    	   }

	       if(flag) {
	         set.add(tmp);
	       }
	     }
	    }

	    if(set.size()>=4) {
	   		System.out.println("yummy");
	    } else {
	   	 	System.out.println("sad");
	    }
	 }
}