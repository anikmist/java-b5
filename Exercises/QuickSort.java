import java.util.Arrays;
ublic class QuickSort {
    
    public static void main(String[] args) {
        int[] x = {32,5,16,1,29,18,27,39,43,42,7,30,2,6,38,39};
        QuickSort.quickSort(x,0, x.length-1);
        System.out.println(Arrays.toString(x));
    }

    static void quickSort(int[] x,int s,int e){
        if(s>=e) return;
        int i= s,j= e-1,p = x[e];
        
        while(i<j){
            while (x[i]<= p && i<j) ++i;
            while (x[j]>= p && i<j) --j;
            QuickSort.swap(x,i,j);
        }
        if(x[i]>p){
            QuickSort.swap(x,i,e);
            QuickSort.quickSort(x,s,i-1);
            QuickSort.quickSort(x,i+1,e);
        }
        else
            QuickSort.quickSort(x,s,e-1);
    }

    static void swap(int[] x,int i,int j){
        int temp = x[i];
        x[i] = x[j];
        x[j] = temp;
    }
}
