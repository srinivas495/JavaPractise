package CoreJavaInterviewQus;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) 
	{
		java.util.HashMap<Integer,String> hm=new java.util.HashMap<Integer,String>();//Creating HashMap    
		hm.put(1,"Mango");  //Put elements in Map  
		hm.put(42,"Apple");    
		hm.put(3,"Banana");   
		hm.put(4,"Grapes");  
		
				
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
					
		Set sn = hm.entrySet(); 
		Iterator it = sn.iterator();
		
		while(it.hasNext()) 
		{
			//System.out.println(it.next());
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();//Creating Hashtable
		ht.put(0, "Srinivas");
		ht.put(1, "");
		ht.put(2, "Chari");
		System.out.println(ht.get(2));
	}	

}
