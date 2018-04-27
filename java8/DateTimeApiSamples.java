package java;

import static java.time.LocalDate.now;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DateTimeApiSamples {

	public static void main(String[] args) {

		Calendar yesterday = Calendar.getInstance();
		yesterday.add(Calendar.DATE, -1);

		LocalDateTime yesterDay = LocalDateTime.now().minusDays(1);
		long between = ChronoUnit.DAYS.between(yesterDay, now());

	}

}
