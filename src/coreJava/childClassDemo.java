package coreJava;

public class childClassDemo extends parentClassdemo{
	
	public void engine()
	{
		System.out.println("new engine");
	}
	public void colour()
	{
		System.out.print(color);
	}

	public static void main(String[] args) {
		childClassDemo cd = new childClassDemo();
		
		cd.colour();

	}

}
