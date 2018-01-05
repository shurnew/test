package kr.geomex.memo;

import java.util.Calendar;

public class Time {

	

	public String getTime() {
		
		Calendar cal = Calendar.getInstance();
		String time = "";
		
		time = "작성시간 :" + cal.get(Calendar.YEAR) +"년 "+ cal.get(Calendar.WEEK_OF_MONTH) +"월 "+ cal.get(Calendar.DAY_OF_YEAR)
				+"일"+ cal.get(Calendar.HOUR)+"시" + cal.get(Calendar.MINUTE) +"분"+ cal.get(Calendar.SECOND)+"초";
	
		return time;
	} 
}
