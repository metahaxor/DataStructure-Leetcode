/*
likes {} // must be "no one likes this"
likes {"Peter"} // must be "Peter likes this"
likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
 */
class carray
{	
	public static String whoLikesIt(String... names) {
		final String Template1 = "%s likes this";
	    final String Template2 = "%s and %s like this";
	    final String Template3 = "%s, %s and %s like this";
	    final String TemplateN = "%s, %s and %d others like this";
	    return
	        names.length == 0 ? "no one likes this" :
	        names.length == 1 ? String.format(Template1, names[0]) :
	        names.length == 2 ? String.format(Template2, names[0], names[1]) :
	        names.length == 3 ? String.format(Template3, names[0], names[1], names[2]) :
	        String.format(TemplateN, names[0], names[1], names.length-2);
	      
	    }
	}


public class char_array {

	
	public static void main(String[] args) {
		String [] a = {"Alex","Jacob", "Mark", "Max"};
		carray c = new carray();
		String n = c.whoLikesIt(a);
System.out.println(n);
	}

}
