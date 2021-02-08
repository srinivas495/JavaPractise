package CoreJavaPart2;

public class thisDemo {
	
	int a = 2; // Global variable
	String b = "Srinivas";
	public void getData() 
	{
		int a= 3; // local variable 
		
		String b = "Chari";
		
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(b);
		System.out.println(this.b);
		//this refer to current object like class level not method 
	}
	
	public static void main(String[] args) 
	{
		thisDemo td = new thisDemo();
		td.getData();
	}

}
