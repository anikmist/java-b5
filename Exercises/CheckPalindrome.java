import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		String s = sc.next();	
		sc.close();		
		System.out.println(CheckPalindrome.cPalindrome(s));
	}
	
	static boolean cPalindrome(String s){
		 
		int j=s.length()-1;
		for(int i=0 ;  i<j   ; ++i,--j) {
			if (s.charAt(i) != s.charAt(j))
					return false;
			
		}
		return true;
	}

}
