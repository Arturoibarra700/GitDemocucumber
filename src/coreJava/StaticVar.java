package coreJava;

public class StaticVar {
	
	String name;
	String address;
	static String city="Guadalajara";
	static int i;
	
	static {
		city = "Guanatos";
		i=0;
	}
	
	
	StaticVar(String name, String address)
	{
		this.name= name;
		this.address = address;
		
	}
	
	public void getAddress() {
		
	System.out.println(address+" "+city);
	}
	public static void getCity()
	{
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar obj = new StaticVar("bob","florida");
		StaticVar obj1 = new StaticVar("Goku","Atlanta");
		obj.getAddress();
		obj1.getAddress();
		

	}

}
