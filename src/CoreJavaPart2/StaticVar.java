package CoreJavaPart2;

public class StaticVar {
	
	String name;	// Instance Variable 
	String address;
	//static String city = "HYD";  // class Variable
	//static int i =0;
	
	static String city;
	static int i;
	
	static // Static block
	{
		city = "Hyd";
		i = 0 ;
	}
	 
	StaticVar(String name, String address)
	{
		this.name = name;
		this.address = address;  // Local Variable
		
		i++;
		System.out.println(i);
		
	}
	
	public void getaddress() 
	{
		System.out.println(address+ " "+ city);
	}
	
	public static void getCity() //Static method
	{
		//Static methods allow only static variables 
		System.out.println(city);
		
	}
	public static void main(String[] args) {
		
		StaticVar obj = new StaticVar("Srinivas","RkPet");
		StaticVar obj1 = new StaticVar("Lokesh","Akkdem");
		obj.getaddress();
		obj1.getaddress();
		StaticVar.getCity();
		StaticVar.i =5;
		getCity();
		System.out.println(obj.address = "TTAS");
	}

}
