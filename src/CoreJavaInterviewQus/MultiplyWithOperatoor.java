package CoreJavaInterviewQus;

public class MultiplyWithOperatoor {
	
	public static void main(String[] args) {
		
		int result = multiply(5,10);//result 50
		System.out.println(result);
	}

	public static int multiply(int i, int j) {
		// i has to sum itself j times to get result
		int k = 1;
		int sum = 0;
		while (k<=j) 
		{
			k++;
			sum = sum+i; 
			//System.out.println(sum);
		}
		return sum;
	}

}
