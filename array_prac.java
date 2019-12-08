class arr
{

	private int [] ar1 ;
	public arr(int size)
	{
		ar1= new int[size];
		
	}
	public void setelement(int index, int value)
	{
		
		ar1[index]=value;
	}
	public int getelement(int index)
	{
		return ar1[index];
	
	}
	
}


public class array_prac {

	public static void main(String[] args) {

		arr A ;
		A= new arr(10);
		int ele= 0;
		A.setelement(0,10);
		A.setelement(1,20);
		A.setelement(2,10);
		A.setelement(3,110);
		ele= 4;
		for(int i =0;i<ele;i++)
		{
			System.out.println(A.getelement(i)+" ");
		}


	}

}
