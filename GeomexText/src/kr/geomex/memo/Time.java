package kr.geomex.memo;

import java.util.Calendar;

public class Time {

	

	public String getTime() {
		
		Calendar cal = Calendar.getInstance();
		String time = "";
		
		time = "�ۼ��ð� :" + cal.get(Calendar.YEAR) +"�� "+ cal.get(Calendar.WEEK_OF_MONTH) +"�� "+ cal.get(Calendar.DAY_OF_YEAR)
				+"��"+ cal.get(Calendar.HOUR)+"��" + cal.get(Calendar.MINUTE) +"��"+ cal.get(Calendar.SECOND)+"��";
	
		return time;
	} 
}
