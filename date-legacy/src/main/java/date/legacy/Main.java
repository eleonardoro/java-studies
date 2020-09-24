package date.legacy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {

		Date now = new Date();
		System.out.println(now);
		
		long time = now.getTime();
		System.out.println(time);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		cal.set(2030, 1, 20, 14, 30, 25);
		System.out.println(cal.getTime());
		
		cal.set(Calendar.YEAR, 2040);
		System.out.println(cal.getTime());
		
		cal.add(Calendar.MONTH, 1);
		System.out.println(cal.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = sdf.parse("03/12/2020 15:55:00");
		System.out.println(d);
		
		System.out.println(sdf.format(cal.getTime()));
		
		cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR, 48);
		System.out.println(cal.getTime());
		
		
	}

}
