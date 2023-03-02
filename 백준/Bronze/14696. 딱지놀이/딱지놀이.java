import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			
			int A = sc.nextInt();
			int[] Aarr = new int[A];
			for(int j=0; j<A; j++) {
				Aarr[j] = sc.nextInt();
			}
			Arrays.sort(Aarr);
//			System.out.println(Arrays.toString(Aarr));
			
			int B = sc.nextInt();
			int[] Barr = new int[B];
			for(int j=0; j<B; j++) {
				Barr[j] = sc.nextInt();
			}
			Arrays.sort(Barr);
//			System.out.println(Arrays.toString(Barr));
			
			int[] Acnt = new int[5];
			for(int j=0; j<Aarr.length; j++) {
				Acnt[Aarr[j]]++;
			}
//			System.out.println(Arrays.toString(Acnt));
			
			int[] Bcnt = new int[5];
			for(int j=0; j<Barr.length; j++) {
				Bcnt[Barr[j]]++;
			}
//			System.out.println(Arrays.toString(Bcnt));
			
			if(Acnt[4]>Bcnt[4]) {
				System.out.println("A");
			} else if(Acnt[4]<Bcnt[4]) {
				System.out.println("B");
			} else if(Acnt[4]==Bcnt[4]) {
				
				if(Acnt[3]>Bcnt[3]) {
					System.out.println("A");
				} else if(Acnt[3]<Bcnt[3]) {
					System.out.println("B");
				} else if(Acnt[3]==Bcnt[3]) {
					
					if(Acnt[2]>Bcnt[2]) {
						System.out.println("A");
					} else if(Acnt[2]<Bcnt[2]) {
						System.out.println("B");
					} else if(Acnt[2]==Bcnt[2]) {
						
						if(Acnt[1]>Bcnt[1]) {
							System.out.println("A");
						} else if(Acnt[1]<Bcnt[1]) {
							System.out.println("B");
						} else if(Acnt[1]==Bcnt[1]) {
							System.out.println("D");
						}
					}
				}
			}
		}
	}
}