package CoreJavaInterviewQus;

public class fibonacciSeries {

	public static void main(String[] args) {
		//0,1, 1 2 3 5 8 13 21 34
		// a =0
		// b =1 //a = 1
		//sum = 1 // b = 1 sum =2
		
		int a =0;
		int b =1;
		int sum;
		int i = 1;
		while(i<9)
		{
			sum = a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			i++;
		}
	}

}
