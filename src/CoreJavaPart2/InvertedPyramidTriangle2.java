package CoreJavaPart2;

public class InvertedPyramidTriangle2 {

	public static void main(String[] args) {
	
		/* 3
		 * 6	9
		 * 12	15	18
		 */
		
		for(int i =1; i<=3; i++) //
		{	
			System.out.println("Outer Loop Started");
			for(int j =1; j<=i; j++)
			{
				System.out.print(j);
				System.out.print("\t");
				System.out.println("Inner Loop");
			}
			System.out.println("");
			System.out.println("Outer Loop Ended");
		}

	}

}
