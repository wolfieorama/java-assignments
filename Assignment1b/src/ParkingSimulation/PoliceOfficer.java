// This is PoliceOfficer  class
// @author John W Munyi
//On my honor, as a Carnegie-Mellon Rwanda student, I have neither given nor received unauthorized assistance on this work.

package ParkingSimulation;

public class PoliceOfficer
{
	private String name, badgeNumber;
	private double additionalMinutes;
	private ParkingTicket ticket;
	private ParkingMeter meter;
	private ParkedCar car;
	
	public PoliceOfficer(String name, String badgeNumber)
	{
		setName(name);
		setBadgeNumber(badgeNumber);
	}

	public String getBadgeNumber()
	{
		return badgeNumber;
	}

	public void setBadgeNumber(String policeBadgeNumber)
	{
		badgeNumber = policeBadgeNumber;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String policeName)
	{
		name = policeName;
	}
	
	public double getAdditionalMinutes(ParkingMeter meter, ParkedCar car)
	{
		additionalMinutes = car.getMinutesParked() - meter.getMinutesPurchased();
		return additionalMinutes / 60;
	}
	
	public void examineTicket(ParkingMeter meter, ParkedCar car)
	{
		if (car.getMinutesParked() > meter.getMinutesPurchased())
		{
			ticket = new ParkingTicket(car, this);
			ticket.calculateFine(getAdditionalMinutes(meter, car));
		}
		else{
			System.out.println("No Fine well within Time :)");
		}
	}
	
	public String toString()
	{
		return name + " and " + " badge Number: " + badgeNumber; 
	}
}
