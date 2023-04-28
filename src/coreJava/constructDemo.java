package coreJava;

public class constructDemo {
	//Defgault
	public constructDemo()
	{
		System.out.println("I am the Constructor");
		System.out.println("I am the Constructor lecture 1");
	}
	
	
	
	
	
	//will not return values
	//name of costructor should be the class name 
	public constructDemo(int a ,int b)
	{
		System.out.println("I am in the parameterized constructor");
	}
	public void getdata()
	{
		System.out.println("I am the method");
	}
	public static void main(String[] args) 
	{
		
		constructDemo cd = new constructDemo();
		constructDemo c = new constructDemo(4,5);
		//compiler will call implicit costructor if you have not defined constructor block
		//when ever you create an object constructor is called
		//block of code when ever an object is created
		

	}

}
