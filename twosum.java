class sumtwo {
    public int[] solf(int[] nums, int target)  
    {
        for(int i =0;i<nums.length;i++)
		 {
	    		for(int j=i+1;j<nums.length;j++)
	    		{
	    			if(nums[j]==target-nums[i])
	    			{
	    				 return new int[] { i, j };
	    			}
	    				
	    		}
		 }
        throw new IllegalArgumentException("No two sum solution");
}  
    
}
public class twosum {
	public static void main(String [] args)
	{ 
		int [] arr ={2, 7, 11, 15};
		int target =9;
	
		sumtwo s1 = new sumtwo();
		int [] sol = s1.solf(arr, target);
		for(int i : sol){
			System.out.println(i);
		}
	       
	}

}	 


    	 

