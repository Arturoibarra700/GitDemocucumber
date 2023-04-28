package coreJava;

import java.util.ArrayList;

public class arrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//can accep duplicate values 
	//ArrayList,LinkedList,vector- Implementing List interface
		//array have fixed size where as assayList can grow dynamicaly
		//you can access and insert any value in any index
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Arturo");
		a.add("java");
		
		System.out.println(a.indexOf("Arturo"));
		
		
		/*for(String elemento: a)
		{
			System.out.println(elemento);
		}	*/	
		
		/*int i=0;
		while(i<a.size())
		{
			//System.out.println(a.get(i));
			if(a.get(i).equals("java"))
			{
				a.remove(i);
			}
			else 
			{
				i++;
			}
		}
		
		System.out.println(a);*/
	}

}
