// This is Parked car class
// @author John W Munyi
//On my honor, as a Carnegie-Mellon Rwanda student, I have neither given nor received unauthorized assistance on this work.

package ParkingSimulation;

public class ParkedCar
{
	private String licenseNumber, make;
	private String color;
	double minutesParked;
	
	public ParkedCar(String make, String licenseNumber,  String color, double minutesParked)
	{
		setMake(make);
		setLicenseNumber(licenseNumber);
		setColor(color);
		setMinutesParked(minutesParked);
	}
	
	public void setMake(String carMake)
	{
		make = carMake;
	}
	
	public String getMake() {
		return make;
	}
	
	public double getMinutesParked()
	{
		return minutesParked;
	}
	
	public void setLicenseNumber(String carLicenseNumber)
	{
		licenseNumber = carLicenseNumber;
	}
	
	public String getLicenseNumber()
	{
		return licenseNumber;
	}
	
	public void setColor(String mycolor)
	{
		color = mycolor;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setMinutesParked(double carMinutes)
	{
		minutesParked = carMinutes;
	}
	
	public String toString()
	{
		return "car make: " + make + "\n" + 
			"licenseNumber: " + licenseNumber + "\n" + 
			"Color: " + color + "\n" +
			"Minutes Parked: " + minutesParked;
	}
	
}
