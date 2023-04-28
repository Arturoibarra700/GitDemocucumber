package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	HashSet treeset, LinkedHashset implements set interface
		//does not accept duplicate values
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("Mexico");
		
		
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
