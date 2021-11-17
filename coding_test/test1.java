/*package whatever //do not write package name here */

/**
 * Sample code to remove a char from a string
 */
class test1 {
	public static void main (String[] args) {
		System.out.println("GfG!");
		String input="Detoxic Soul";
		System.out.println(removeChars(input,'e'));
	}
	public static String removeChars(String input, char key){
	    String output="";
	    for(int i=0; i<input.length(); i++){
	        char x=input.charAt(i);
	        if(x!=key){
	            output=output+x;
	        }
	    }
	    return output;
	}
}