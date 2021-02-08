package CoreJavaInterviewQus;

public class PrimeNumber {
	public static void main(String[] args) {
		// 11%5 = 1 remider // if it is 0 is reminder not prime number
		// 11%i=0   ans is 0 it is not prime
				int val = 31;
		boolean flag = false;
		for(int i =2; i<=val/2; i++)
		{
			if(val%i ==0)
			{
				flag = true;
				break;
			}
		
		}
		
		if(flag)
			System.out.println("it is not prime number");
		else
			System.out.println("it is prime number");
		
	}

}
