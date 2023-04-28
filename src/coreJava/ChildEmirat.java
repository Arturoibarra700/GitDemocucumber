package coreJava;

public class ChildEmirat extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirat c = new ChildEmirat();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();
		
		
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		
		System.out.println("Red color on the body");
	}

}
