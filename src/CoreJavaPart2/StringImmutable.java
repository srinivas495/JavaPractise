package CoreJavaPart2;

public class StringImmutable {

	public static void main(String[] args) {
	// String immutable
		String a = "heallaao";
		
		System.out.println(a.indexOf("a"));
		String b = "hello";
		a.concat("word");
		System.out.println(a); 	//hello
		String c = a.concat("word");
		System.out.println(c);	//helloword
		
		
		
		String s = new String("hello");
		String s1 = new String("hello");
		s.concat("Word");
		System.out.println(s); 	//hello
		
		System.out.println(a.equals(b)); // true
		System.out.println(a.equalsIgnoreCase(b)); // true
		System.out.println(a==b); // true
		System.out.println(a==s); // false
		System.out.println(s==s1); // false
		
		//String Buffer and String Builder -Mutable  
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("word");
		System.out.println(sb); 	//helloword
		sb.insert(2, "She");	//2 index "Which word insert"	
		System.out.println(sb);    	//heShelloword
		sb.replace(5, 7, "aa");   //Start index 5 char End 7Char
		System.out.println(sb); 	//heSheaaoword
		sb.deleteCharAt(0);			// remove the index 0 means 1 position
		System.out.println(sb); 	//eSheaaoword
		sb.reverse();
		System.out.println(sb);     //drowoaaehSe 
		
		//String Builder is not thread safe .
		//it is non Synchronized
		// it is faster execution
		// When you run in parallmode exaction use String Buffer
		// String builder make modification allows exacting object at a time // not getting correct result	
		
		
	}

}
