package kr.geomex.dateTest;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.Calendar;


public class DateTest {
	
	Date date=new Date();
	
	Calendar cal=Calendar.getInstance();
	
	GregorianCalendar gc=new GregorianCalendar(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),cal.get(Calendar.DATE),
			cal.get(Calendar.HOUR),cal.get(Calendar.MINUTE),cal.get(Calendar.SECOND));
	
	GregorianCalendar gc1=new GregorianCalendar();
	
	public void print() {
		

        System.out.println("getYear:"+cal.get(Calendar.YEAR));
        System.out.println("getMonth:"+cal.get(Calendar.MONTH));
        System.out.println("getDay:"+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("getTime:"+cal.getTime());	
		System.out.println("getDate:"+cal.get(Calendar.DATE));
		System.out.println("getHours:"+cal.get(Calendar.HOUR));
		System.out.println("getMinutes:"+cal.get(Calendar.MINUTE));
		
		System.out.println("getSeconds:"+cal.get(Calendar.SECOND));
		
		System.out.println("get():"+cal.get(Calendar.DAY_OF_WEEK));
	}
	
	public void print2() {
		
		gc.set(GregorianCalendar.MILLISECOND, 111);
		
		
		
		System.out.println("year:"+gc1.get(GregorianCalendar.YEAR));
		System.out.println("Mounth:"+gc1.get(GregorianCalendar.MONTH));
		System.out.println("date:"+gc1.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println("hour:"+gc1.get(GregorianCalendar.HOUR_OF_DAY));
		System.out.println("minute:"+gc1.get(GregorianCalendar.MINUTE));
		System.out.println("second:"+gc1.get(GregorianCalendar.SECOND));
		System.out.println("millisecond:"+gc1.get(GregorianCalendar.MILLISECOND));
		System.out.println("all millisecond : "+gc1.getTimeInMillis());
		
	}
	
	public void print3() {
	
		SimpleTimeZone stz = new SimpleTimeZone(100000,"none"); 
		
		gc.setTimeZone((TimeZone)stz);
		
		SimpleTimeZone stz2 = (SimpleTimeZone)gc.getTimeZone();
		
		System.out.println("SimpleTimeZone :" +stz2.getRawOffset());
		}
	
}
