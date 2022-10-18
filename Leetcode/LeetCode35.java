class Solution {
    public int searchInsert(int[] x, int target) {
        
        return Solution.bSearch(x,0,x.length-1,target);   
        
        
    }
    
    public static int bSearch(int[] x, int s, int e, int t){
        
        while(s<=e){
              
        	int m = s + (e-s)/2;
             
            if (x[m]==t) return m;
        
            else if(x[m]>t)
            e = m-1;
        
            else
            s = m+1;
            
        }
        int p=0;
        for( ;p<x.length;++p) {
        	if (x[p] > t)
        		return p;
        }
        
        return p;
        
    }
}
