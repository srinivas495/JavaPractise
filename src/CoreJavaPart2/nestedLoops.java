package CoreJavaPart2;

public class nestedLoops {

	public static void main(String[] args) {
		
		for(int i =1; i<=4; i++)
		{
			System.out.println("Outer Loop is Started");
			
			for(int j=1; j<=4; j++)
			{
			System.out.println("Inner Loop");
			}
			
			System.out.println("Outer Loop is Ended");
		}
		

	}

}
