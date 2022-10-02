import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		int[] x = new int[10];
		Random rnd = new Random();
		for(int i=0; i<x.length;++i) {
			x[i] = rnd.nextInt(100);
		}
		
		System.out.println(Arrays.toString(x));
		QuickSort.quickSort(x, 0, x.length-1);
		System.out.println(Arrays.toString(x));

	}
	
	static void quickSort(int[] x, int s, int e) {
		
		if(s>=e) return;

		int p = x[e];
		int i=s;
		int j=e;
		
		while (i<j){
			
			while(x[i]<=p && i<j) {
				++i;
			}
			while(x[j]>=p && i<j) {
				--j;
			}
			
			QuickSort.swap(x, i, j);
			
		}
		
		QuickSort.swap(x, i, e);
		QuickSort.quickSort(x, s, i-1);
		QuickSort.quickSort(x, i+1, e);
	}
	
	static void swap(int[] x,int i,int j) {
		int temp = x[i];
		x[i] = x[j];
		x[j] = temp;
	}

}
