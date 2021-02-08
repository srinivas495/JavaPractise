package CoreJavaInterviewQus;

public class PrintPyramid {

	public static void main(String[] args) {
		// Program for Printing Pyramid pattern in Java
		//	*
		//	* * 
		//	* * *
		//  * * * * 
		for(int i=1; i<5; i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
