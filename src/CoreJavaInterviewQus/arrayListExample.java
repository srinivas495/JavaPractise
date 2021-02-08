package CoreJavaInterviewQus;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Srinivas");
		a.add("Chari");
		System.out.println(a);
		a.add(0, "Java");
		System.out.println(a);
		//a.remove(1);
		System.out.println(a);
		//a.remove("Java");
		System.out.println(a);
		//a.removeAll(a);
		System.out.println(a);
		//a.get(2);
		System.out.println(a.get(1));
		System.out.println(a.contains("Java"));
		System.out.println(a.indexOf("Java"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}
