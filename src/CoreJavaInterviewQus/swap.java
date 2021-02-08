package CoreJavaInterviewQus;

public class swap {

	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int temp;
		
		temp =a;
		a=b;
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
		//without using variable swipe the variable
		a = a+b; // a =9
		b = a-b; // 9-5 = 4 b= 4
		a = a-b; // 9-4 = 5 a= 5
		
	}

}
