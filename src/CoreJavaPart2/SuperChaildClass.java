package CoreJavaPart2;

public class SuperChaildClass extends SuperParentClass {

	String name = "Srinivas Chaild";
	
	public void getStringData() 
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	
	public void getData() {
		super.getData();
		System.out.println("I am Child Method");
	}
	
	public SuperChaildClass() {
		super();
		System.out.println("I am Child Constructor");
	}
	
	
	public static void main(String[] args) 
	{
		SuperChaildClass sc= new SuperChaildClass();
		sc.getStringData();
		sc.getData();
	}

}
