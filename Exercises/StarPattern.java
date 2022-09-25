import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		int n1 = n/3;
		int n2 = n/3;
		int n3 = n/3;
		
		
		//Part One
		
		for (int r=1; r<=n1; ++r) {
			
			for(int s=n-r-2;s>0;--s) {
				System.out.print(" ");
			}
			
			for(int c=1;c<=2*r-1;++c) {
				System.out.print("*");
			}
			
			System.out.println("");
			
			
		}
		
		//Part Two
		
		for (int r=1; r<=n2; ++r) {
			
			for(int s=r-1;s>0;--s) {
				System.out.print(" ");
			}
			
			for(int c=1; c<n-r;++c) {
				System.out.print("* ");
			}
			
			System.out.println("");
			
			
		}
		
		
		
		//Part Three-1
		
		for (int r=n3; r<=n3; ++r) {
			
			for(int s=r-1;s>0;--s) {
				System.out.print(" ");
			}
			
			for(int c=1; c<n-r;++c) {
				System.out.print("* ");
			}
			
			System.out.println("");
			
			
		}
		
		//Part Three-2
	
		
		for (int r=n3-1,q=2; r>=1; --r,q=q+3) {
			
			for(int s1 = r-1; s1>0; --s1) {
				
				System.out.print(" ");
			}
			
			for(int c=r; c>0;--c) {
				System.out.print("* ");
			}
			
			for(int s2=q; s2>0; --s2) {
				System.out.print("  ");
			}
			
			for(int c=r; c>0;--c) {
				System.out.print("* ");
			}
			
			System.out.println("");
			
		}
		
		
		

	}

}
