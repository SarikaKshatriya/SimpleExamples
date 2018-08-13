package SimpleExamples;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.YearMonth;
import java.time.ZonedDateTime;

public class TimeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Local Time:"+ LocalTime.now().toString());
		System.out.println("Local Date Time:"+ LocalDateTime.now().toString());
		System.out.println("Zone Date Time:"+ ZonedDateTime.now().toString());
		System.out.println("Local Time:"+ LocalTime.now().toString());
		System.out.println("Offset Time:"+ OffsetTime.now().toString());
		System.out.println("Offset Date Time:"+ OffsetDateTime.now().toString());
		System.out.println("Month Day:"+ MonthDay.now().toString());
		System.out.println("Year Month:"+ YearMonth.now().toString());
		System.out.println("Instant:"+ Instant.now().toString());
	}

}
