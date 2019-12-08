class square
{
	static boolean isperfect(double x){
	double sr= Math.sqrt(x)% 1  ;
	System.out.println(sr);
	System.out.println(Math.floor(sr));
	return ( (sr - Math.floor(sr)) == 0);
	}




	public static void main(String[] args) {
		
double x = 12 ;
if(isperfect(x)){
	System.out.print("Yes"); 
	
}
else
	System.out.print("No"); 

}
}
