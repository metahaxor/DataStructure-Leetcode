import java.util.Arrays;
//Input: nums1 = [1,2,2,4], nums2 = [2,2]
//Output: [2,2]
//https://leetcode.com/problems/intersection-of-two-arrays-ii/
//Input: nums1 = [4,5,9], nums2 = [4,4,8,9,9]
//Output: [4,9]
class sol_inter {
    public int[] intersect(int[] nums1, int[] nums2) {
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	int minlen= nums1.length<nums2.length ? nums2.length :nums1.length;
    	//int minlen= Math.min(nums1.length, nums2.length);
    	int [] arr = new int[minlen];
    	int i =0,k=0,j=0;
    	if(minlen==0)
    	{
    		return arr;
    	}
    	
    	while(i<nums1.length && j<nums2.length)
    	{
    		if(nums1[i] == nums2[j])
    		{
    			arr[k++]=nums1[i];
    			i++;
    			j++;
    		}
    		else if(nums1[i]< nums2[j])
    		{
    			i++;
    		}
    		else {
    			j++;
    		}
    	}
    		
    		
		return Arrays.copyOf(arr,k) ;//to return array by value
    	//return arr;
    }
}
public class intersection_array {
	public static void main(String[] args) {
		int [] arr1 = {4,5,9};
		int [] arr2 = {4,4,8,9,9};
		sol_inter s = new sol_inter();
		int [] arr3 = s.intersect(arr1, arr2);
		System.out.println("__________________________________");
for(int a : arr3)
{
	System.out.println(a);
	}
	}

}
