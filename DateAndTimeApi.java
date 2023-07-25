package NewFeatures;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateAndTimeApi {

	public static void main(String[] args) throws ParseException {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.isLeapYear());
		
		LocalDate date2 = LocalDate.of(2000, 12, 14);
		System.out.println(date2.isLeapYear());
		
		System.out.println(date.minusDays(2));
		System.out.println(date.plusDays(3));
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.getDayOfMonth());
		
		String stringDate = "2000-12-01";
		LocalDate d = LocalDate.parse(stringDate);
		System.out.println(d);
		
	}
	
}
