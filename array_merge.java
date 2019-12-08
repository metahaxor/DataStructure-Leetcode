//https://leetcode.com/problems/merge-sorted-array/
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
// 1,2,3,2,5,6
//Output: [1,2,2,3,5,6]

class merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	
    	if(nums1.length <0 && nums2.length<0)
    	{
    		
    	}
    	
    	int i =0;
    	while(i< nums2.length)
    	{
    		nums1[m++]=nums2[i];
    		i++;
    	}
    	
    	int in,out,min;
        for(out=0;out<nums1.length;out++)
        {
        	min = out;
        	for( in=out+1;in<nums1.length;in++)
        	{
        		if(nums1[in]<nums1[min])
        		{
        			min = in;
        			int temp = nums1[in];
        			nums1[in]=nums1[out];
        			nums1[out]=temp;
        			
        		}
        		
        	}
        	
        }
        for(int z : nums1)
		{
			System.out.println(z);
		}
    	
    } 

	}

public class array_merge {
	public static void main(String[] args) {
		int [] arr ={4,5,6,0,0,0};
		int [] arr1 ={1,2,3};
		merge m = new merge();
		m.merge(arr, 3, arr1, 3);
		
		
		
		
	}

}
