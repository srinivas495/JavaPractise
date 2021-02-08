package CoreJavaInterviewQus;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarAndDate {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh/mm");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.MINUTE));

	}

}
