package coreJava;

public class childDemo extends paterntDemo {
	
	String name ="Ibarra Olivares";
	
	public childDemo()
	{
		super();//this should be always be at first line
		System.out.println("child class constructor");
	}
	
	public void getStringData() 
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}
	public void getData()
	{
		super.getData();
		System.out.println("I am in child class");
	}

	public static void main(String[] args) {
		
		childDemo cd = new childDemo();
		
		cd.getStringData();
		
		cd.getData();
		

	}

}
