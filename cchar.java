


class sol1{
	int removeDuplicates(int [] nums){ 
		if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
	}
	
}

public class cchar {
public static void main(String[] args) {
	int [] arr ={1,1,2,3,4};
	sol1 s1 = new sol1();
	int s = s1.removeDuplicates(arr);
	System.out.println(s);
	
		}
}