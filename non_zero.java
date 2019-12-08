//https://leetcode.com/problems/move-zeroes/

class sol4 {
     void moveZeroes(int[] nums) {
        int ele = nums.length;
       int j =0;
        for(int i=0;i<ele;i++)
        {
            if(nums[i]!=0)
            {
                 nums[j]=nums[i];
                 j++;
            }
        }
        
    for (;j<ele;j++)
    	nums[j]=0;
     
     }
     
}

public class non_zero {

	public static void main(String[] args) {
		int [] arr ={0,1,0,3,12};
		sol4 s1 = new sol4();
		s1.moveZeroes(arr);
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

}
