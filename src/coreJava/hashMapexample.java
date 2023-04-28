package coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(0,"Hello");
		hm.put(1,"its me");
		hm.put(2,"good");
		hm.put(2,"Morning");
		System.out.println(hm.get(2));
		hm.remove(2);
		
		Set sn= hm.entrySet();
		Iterator<String> it =sn.iterator();
		
		while(it.hasNext())
		{
			
		}
		

	}

}
