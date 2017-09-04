package john;

import java.util.Date;
public class TestTimeEntry extends TimeEntry {
	public static void main(String[] args)
	{
		TimeEntry timeEntry = new TimeEntry();
		
		timeEntry.setTimeStamp(new Date());
		timeEntry.setHoursWorked(8.0);
		timeEntry.setComments("Just some dummy text");
		System.out.println(timeEntry);
	}
}
