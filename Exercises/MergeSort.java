import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] x = {32,5,16,1,29,18,27,39,43,42,7,30,2,6,38,39};
        MergeSort.mergeSort(x);
        System.out.println(Arrays.toString(x));
    }

    static void mergeSort(int[] x){
        if(x.length<2) return;
        int m = x.length/2;
        int[] s1 = new int[m];
        int[] s2 = new int[x.length-m];
        
      for(int i=0; i<m ;++i)
            s1[i] = x[i];
        
      for(int j=0; j<x.length-m;++j)
            s2[j]=x[j+m];
        MergeSort.mergeSort(s1);
        MergeSort.mergeSort(s2);
        MergeSort.merge(x,s1,s2);
    }
    static void merge(int[] x,int[] s1,int[] s2){
        int i=0,j=0,k=0;
        while(i< s1.length && j< s2.length){
            if(s1[i]<=s2[j]){
                x[k] = s1[i];
                ++k; ++i;
            }

            else{
                x[k] = s2[j];
                ++k; ++j;
            }
        }
        while(i<s1.length){
            x[k] = s1[i];
            ++k; ++i;
        }
        while(j< s2.length){
            x[k] = s2[j];
            ++k; ++j;
        }
    }
}
