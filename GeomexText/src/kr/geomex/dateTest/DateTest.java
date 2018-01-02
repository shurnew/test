package kr.geomex.dateTest;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.Calendar;


public class DateTest {
	
	Date date=new Date();
	Calendar cal=Calendar.getInstance();
	GregorianCalendar gc=new GregorianCalendar(date.getYear(),date.getMonth(),date.getDate(),
				date.getHours(),date.getMinutes(),date.getSeconds());
	
	public void print() {
		System.out.println("getTime:"+date.getTime());	
		System.out.println("getDate:"+date.getDate());
		System.out.println("getDay:"+date.getDay());
		System.out.println("getHours:"+date.getHours());
		System.out.println("getMinutes:"+date.getMinutes());
		System.out.println("getMonth:"+date.getMonth());
		System.out.println("getSeconds:"+date.getSeconds());
		System.out.println("getYear:"+date.getYear());
		System.out.println("get():"+cal.get(Calendar.DAY_OF_WEEK));
	}
	
	public void print2() {
		
		gc.set(GregorianCalendar.MILLISECOND, 111);
		
		
		
		System.out.println("year:"+gc.get(GregorianCalendar.YEAR));
		System.out.println("Mounth:"+gc.get(GregorianCalendar.MONTH));
		System.out.println("date:"+gc.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println("hour:"+gc.get(GregorianCalendar.HOUR_OF_DAY));
		System.out.println("minute:"+gc.get(GregorianCalendar.MINUTE));
		System.out.println("second:"+gc.get(GregorianCalendar.SECOND));
		System.out.println("millisecond:"+gc.get(GregorianCalendar.MILLISECOND));
		System.out.println("all millisecond:"+gc.getTimeInMillis());
		
	}
	
	public void print3() {
	
		SimpleTimeZone stz = new SimpleTimeZone(100000,"none"); 
		
		gc.setTimeZone((TimeZone)stz);
		
		SimpleTimeZone stz2 = (SimpleTimeZone)gc.getTimeZone();
		
		System.out.println("SimpleTimeZone :" +stz2.getRawOffset());
		}
	
}
