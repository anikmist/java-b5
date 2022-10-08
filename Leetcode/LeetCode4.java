public class LeetCode4 {

	public static void main(String[] args) {
		
		int[] x = {1,2};
		int[] y = {3,4};
		
		System.out.println(findMedianSortedArrays(x,y));

	}
	
   public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int i=0,j=0,k=0;
        //double m = 0.0;
        int[] x =new int[nums1.length+nums2.length];
        while (i<nums1.length && j<nums2.length){
            
        	if(nums1[i] <= nums2[j]) {
        		x[k] = nums1[i];
        		++k; ++i;
        	}
        	else {
        		x[k] = nums2[j];
        		++k;++j; 
        	}
            
        }
        
        while(i<nums1.length) {
        	x[k] = nums1[i];
        	++k;++i;
        }
        
        while(j<nums2.length) {
        	x[k] = nums2[j];
        	++k; ++j;
        }
        
        if(x.length%2==0)
        return (x[x.length/2]+x[(x.length/2)-1])/2.0;
        else
        	return ((double)x[x.length/2]);
    }

}
