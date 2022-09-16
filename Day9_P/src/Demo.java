import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.Period;
import java.time.LocalDate;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime start=LocalTime.of(10, 2, 10);
		LocalTime end=LocalTime.of(11, 2,8);
		
		Duration d=Duration.between(start, end);
		System.out.println(d);
	
		long duration=Duration.between(start, end).toMillis();
		System.out.println(duration);
		
		Instant startInstant=Instant.now();
		System.out.println(startInstant);
		LocalDate startLocalDate=LocalDate.of(2020, 3,12);
		LocalDate endLocalDate=LocalDate.of(2020, 7, 20);
		
		Period periodBetween=Period.between(startLocalDate, endLocalDate);
		
		System.out.println(periodBetween);
		
		System.out.println(periodBetween.getDays());
		System.out.println(periodBetween.getMonths());
		System.out.println(periodBetween.getYears());
	

	}

}
