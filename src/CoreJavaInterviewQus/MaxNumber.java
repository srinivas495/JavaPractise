package CoreJavaInterviewQus;

public class MaxNumber {

	public static void main(String[] args) {
		// Min no Max no
		
		int abc [][] = {{2,7,8},{3,4,7},{1,2,9}};
		int max =abc[0][0];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(abc[i][j]>max)
				{
					max = abc[i][j];
				}
			}
			
		}
		
		System.out.println(max);
	}

}
