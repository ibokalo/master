package HomeWork3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateLab2 {

	public static void main(String[] args) {

		Date today = new Date();
		SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy:MM:dd");
		Calendar cal = Calendar.getInstance();
		System.out.println("Today date is " + today);
		cal.add(Calendar.YEAR, 32);
		cal.add(Calendar.MONTH, 22);
		cal.add(Calendar.DAY_OF_MONTH, 5);
		String nextDate = (String) (formattedDate.format(cal.getTime()));
		System.out.println("Next date is " + nextDate);

	}
}