package CoreJavaInterviewQus;

import java.util.ArrayList;

public class collectDemoDuplicateNumber {

	public static void main(String[] args) {
		int a[] = {4,4,5,6,4,7,5,6,7,8,9,4,8};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0 ; i<a.length; i++)
		{
			int k=0; 
			if(!al.contains(a[i]))
			{
				
				al.add(a[i]);
				k++;
				for(int j=i+1; j<a.length;i++)
				{
					if(a[i]==a[j])
					{
						k++;
					}  
				}
				
			}
			System.out.println(a[i]);
			System.out.println(k);
		}
		
		
	}
	
}
