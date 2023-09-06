package string_in_java;

import java.util.Iterator;

public class String_demo {

	public static void main(String[] args) {
		
		String_demo obj  =  new String_demo();
		
		//obj.length();
		//obj.concat();
		//obj.charat();
		//obj.Uppercase();'
		//obj.Lowercase();
		//obj.stripleading();
		//obj.striptrallinig();
		//obj.trim();
		//obj.contains();
		//obj.subString();
		//obj.startswith();
		//obj.endwith();
		//obj.split();
		//obj.replace();
		//obj.chattoarray();
		//obj.valueOf();
		//obj.IndexOf();
		//obj.equals();
		//obj.replacefrist();
		//obj.replaceall();
		//obj.compareto();

	}

	private void compareto() {
		
		String name1 = "Subramani";
		
		String name2 = "Suvetha";
		
		System.out.println(name1.compareTo(name2));
		
		System.out.println(name2.compareTo(name1));
		
	}

	private void replaceall() {
		
		 String name = "alraj";
			
			//String name1 ="alraj";
			
			System.out.println(name.replaceAll("a","@"));
	}

	private void replacefrist() {
		                                // first letter replace
        String name = "Alraj";
		
		//String name1 ="alraj";
		
		System.out.println(name.replaceFirst("A","@"));
		
	}

	private void equals() {         // equals is name is same is present 
		
		String name = "Alraj";
		
		String name1 ="alraj";
		
		System.out.println(name.equals(name1));
		
	}

	private void IndexOf() {
		
		String Name = "Subramani";
		
		int index = Name.indexOf("a");   // lest to right
		
		System.out.println(index);
		
		int last = Name.lastIndexOf("a");  // right to left
		
		System.out.println(last);
		
	}

	private void valueOf() {           // join the value 
		
		String a = String .valueOf(10);
		String b = String .valueOf(10);
		System.out.println(a+b);
			
	}

	private void chattoarray() {
		
		
		String name = "Subarmani";
		
		char[] arr = name.toCharArray();  // String covert to  char
		
		//System.out.println(name.toCharArray());
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}

	private void replace() {      // repalce particular word or letter
		
		String name = "Subramani Suvetha"; 
		
		name = name . replace("Suvetha", "Nivetha");
		
		System.out.println(name);
		
	}

	private void split() {                  // input value  delete  remains output show
		
		String name = "Subramani SuvethaS"; 
		
		String s[] = name.split("SuvethaS");
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
		}
		
	}

	private void endwith() {
		
        String name = "Subramani  Suvetha";  //  end its there  present
		
	    boolean  ends = name.endsWith("Suvetha");
	   
	   System.out.println(ends);
		
		
	}

	private void startswith() {
		

		String name = "Subramani  Suvetha ";  //  start its there present
		
	    boolean   starts = name.startsWith("Suvetha");
	   
	   System.out.println(starts);
		
	}

	private void subString() {
		
		String name = "Subramani";  // 2nd position to print all words
		
	   name = name.substring(3,4);
	   
	   System.out.println(name);
		
	}

	private void contains() {
		
		String name = "   Subrramani   "; //  check the value its true or false 
		
		System.out.println(name.contains("hi"));
		
	}

	private void trim() {
		
		String name = "   Subrramani   "; // start  and last space remove 
		name = name.trim();
		System.out.println(name);
		
	}

	private void striptrallinig() {
		
		String name = "Subrramani    "; // last space remove 
		name = name.stripTrailing();
		System.out.println(name);
		
	}

	private void stripleading() {
		
		String name = "     Subrramani"; // start space remove 
		name = name.stripLeading();
		System.out.println(name);
		
	}

	private void Lowercase() {
		String name = "SUBRAMANI";
		System.out.println(name.toLowerCase());
	
	}

	private void Uppercase() {
		
		String name = "subramani";
		System.out.println(name.toUpperCase());
	}

	private void concat() {
		String name = "Subramani_";
		String name1 = "Suvetha_";
		String name2 = "143";
		
		System.out.println(name+name1+name2); // concat 
		
	}

	private void length() {
		
	String name = "Subramani";
	System.out.println(name.length());
		
	}

}
