package com.sk.learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		cal.set(year, month, day, 0,0,0);
		System.out.println("Start Date : "+format.format(cal.getTime()));
		cal.set(year, month, day, 23,59,59);
		System.out.println("End Date : "+format.format(cal.getTime()));
		
		try {
			Date dat = format.parse(format.format(cal.getTime()));
			System.out.println(dat);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(formater.format(cal.getTime()));
		cal.add(Calendar.DATE, -5);
		System.out.println(formater.format(cal.getTime()));*/
	}

}
