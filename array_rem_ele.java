//Given nums = [3,2,2,3], val = 3,

//Your function should return length = 2, with the first two elements of nums being 2.


class sol3{
	    int removeElement(int[] nums, int val) {
		int ele=nums.length;
	        int i=0;
	        for(int j=0;j<ele;j++)
	        {
	            if(nums[j]!=val)
	            {
	                nums[i]=nums[j];
	                i++;
	            }
	            
	        }
		
					
			
			for(int k=0;k<ele;k++)
				System.out.println(nums[k]);
			return i;

	    }
	

}
public class array_rem_ele {
	public static void main(String[] args) {
		int [] arr ={3,2,2,3};
		sol3 s1 = new sol3();
		int s = s1.removeElement(arr,3);
		System.out.println("size "+s);

	}

}
