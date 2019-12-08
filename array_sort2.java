
//[1,1,1,2,2,3],
//1, 1, 2, 2 and 3 
class sol2{
	int removeDuplicates(int [] nums){ 
		if (nums.length == 0) return 0;
		
		int flag =1;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
    	flag++;
        if (nums[j] != nums[i] && flag>2 ) {
          
            nums[i] = nums[j];
            i++;
        }

    }
    for( int j=0;j<nums.length;j++)
    {
    	System.out.println(nums[j]);
    }
    return i + 1;
	}
	
}


	
		
public class array_sort2 {
	public static void main(String[] args) {

		int [] arr ={1,1,1,2,2,3};
		sol2 s1 = new sol2();
		int s = s1.removeDuplicates(arr);
		System.out.println(s);

	}

}
