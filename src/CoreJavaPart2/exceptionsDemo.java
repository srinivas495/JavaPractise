package CoreJavaPart2;

public class exceptionsDemo {
	
	
	public static void main(String[] args) 
	{
		int a = 7;
		int b = 0;
		try
		{
			int c = a/b;		// if Script fail here and come to catch block 
								// if purchased failed 
// try block code if any special day open pop up if not open pop up 
// catch block normal code will executed 			
			System.out.println(c);
		}
		catch(Exception e) 
		{						// retry agin code will ex
			System.out.println("I catch error / exception");
		}		
		
		finally 
		{
			System.out.println("finial ");
		}
	}

}
