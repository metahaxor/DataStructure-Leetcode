

class Solution {
    public int [] rotate(int[] nums, int k) {
    	k = k % nums.length;
    	while(k!=0)
    	{
    		rotateR(nums);
    		k--;
    	}
		return nums;
    	}
    	 public void rotateR(int [] arr){
    		int n = arr.length;
    		
    		int temp = arr[n-1];
    		for(int i =n-1; i>0;i--){
    			arr[i]= arr[i-1];
    			
    		}
    		arr[0]=temp;
    	}
    	
    }
    
    
    
    
public class rotate_array {
	

	public static void main(String[] args) 
{
	//	int [] arr2 = new int[7];
		
		int [] arr1={1,2,3,4,5,6,7};
Solution s1 = new Solution();
int [] arr2 =s1.rotate(arr1, 4);
for(int i : arr2)
	System.out.println(i+" ");
}
}
