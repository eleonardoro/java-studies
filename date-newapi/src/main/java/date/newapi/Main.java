package date.newapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Main {

	public static void main(String[] args) {

		String date = "17/05/1982 22:00:00";
		
		LocalDateTime ldt = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		System.out.println(ldt);

		LocalDateTime now = LocalDateTime.now();
	
		Duration d = Duration.between(ldt,  now);
		System.out.println(d.toHours());
		
		Period p = Period.between(ldt.toLocalDate(), now.toLocalDate());
		System.out.println(p.toTotalMonths());
		
		System.out.println(ChronoUnit.WEEKS.between(ldt, now));
		
		YearMonth ym = YearMonth.of(2030, 10);
		System.out.println(ym);
		
		Month month = Month.of(3);
		System.out.println(month);
				
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		System.out.println(ld.plusMonths(1));
	}

}
