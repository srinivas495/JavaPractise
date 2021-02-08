package CoreJavaPart2;

public class MultiDimensinalArray {

	public static void main(String[] args) {
		
		//a[rows][coloum]
		
		int a[][] = new int[3][3];
		
		/* 5 9 2
		 * 5 2 1 
		 * 9 7 2
		 */
		
		a[0][0] = 5;
		a[0][1] = 9;
		a[0][2] = 2;
		
		a[1][0] = 5;
		a[1][1] = 2;
		a[1][2] = 1;
		
		a[2][0] = 9;
		a[2][1] = 7;
		a[2][2] = 2;
		
		int b[][] = {{2,4,6},{7,8,9}};
		
			
		for(int i =0; i<3; i++)  //rows
		{
			
			for(int j=0;j<3 ; j++) // coloumn
			{
				System.out.println(a[i][j]);
			}
			
		}

	}

}
