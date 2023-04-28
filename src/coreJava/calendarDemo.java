package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy");
		
		System.out.print(sd.format(cal.getTime()));

	}

}
