package CoreJavaInterviewQus;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) 
	{
		// HashSet, LinkedSet, TreeSet
		
		
		java.util.HashSet<String> hs = new java.util.HashSet<String>();
		System.out.println(hs.add("USA"));
		System.out.println(hs.add("UK"));
		System.out.println(hs.add("India"));
		System.out.println(hs.add("India"));
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
