package john;

import java.util.Date;
public class TimeEntry {
	
	private Date timestamp;
			Double hoursWorked;
			String comments;
	
	public TimeEntry() {
		timestamp = new Date();
	    hoursWorked = 0.0;
	    comments = "default comment";
	}
	
	public Date getTimeStamp()
	{
	    return timestamp;
	}
	
	public Double gethoursWorked()
	{
	    return hoursWorked;
	}
	
	public String getComments() {
		return comments;
	}
	
	public void setTimeStamp(Date mydate)
	{
	    timestamp = mydate;
	}
	
	public void setHoursWorked(Double myhours)
	{
	    hoursWorked = myhours;
	}
	
	public void setComments(String mycomments) {
		comments = mycomments;
	}
	
	public String toString() {
		return comments + " " + timestamp + " " + hoursWorked;
	}
}
	
