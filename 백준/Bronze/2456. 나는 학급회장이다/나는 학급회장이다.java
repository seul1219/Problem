import java.io.*;
import java.util.*;

public class Main {
  
   public static List<Integer> maxList = new ArrayList<>();
   public static int[][] scores = new int[3][3];
   public static int res = 0;
   
   public static void main(String args[]) throws IOException { 
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     int N = Integer.parseInt(br.readLine());
     int[] sum = new int[3];
     int max = 0;
     for(int i=0; i<N; i++) {
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       for(int j=0; j<3; j++) {
    	 int cur = Integer.parseInt(st.nextToken());
         sum[j] += cur;
         max = Math.max(max, sum[j]);
         scores[j][cur-1]++;
       }
     }
     
     for(int i=0; i<3; i++) {
       if(max==sum[i]) {
         maxList.add(i);
       }
     }
     
     if(maxList.size()==1) {
    	 res = maxList.get(0);
    	 System.out.println((res+1) + " " + sum[res]);
    	 return;
    	 
     } else if(maxList.size()>1) {
    	 
       boolean flag = false;
       for(int i=2; i>0; i--) {
    	   flag = maxOne(i);
    	   
    	   if(flag) {
    		   System.out.println((res+1) + " " + sum[res]);
    		   return;
    	   }
       }
       
       if(!flag) {
    	   System.out.println(res + " " + max);
    	   return;
       }
     }
    }
    
    public static boolean maxOne(int score) {
		int max2 = 0;
		for(int i=0; i<maxList.size(); i++) {
			int cur = maxList.get(i);
			max2 = Math.max(max2, scores[cur][score]);
		}
		
		List<Integer> maxList2 = new ArrayList<>();
		for(int i=0; i<maxList.size(); i++) {
			int cur = maxList.get(i);
			if(max2==scores[cur][score]) {
				maxList2.add(cur);
			}
		}
		
		if(maxList2.size()==1) {
			res = maxList2.get(0);
			return true;
		} else {
			return false;
		}
    }
 }