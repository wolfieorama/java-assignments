// This is Parking Meter class
// @author John W Munyi
//On my honor, as a Carnegie-Mellon Rwanda student, I have neither given nor received unauthorized assistance on this work.

package ParkingSimulation;
public class ParkingTicket
{
	private double finalFine;
	private PoliceOfficer police;
	private ParkingMeter meter;
	private ParkedCar car;
	
	public ParkingTicket(ParkedCar car, PoliceOfficer police)
	{
		this.police = police;
		this.car = car;
	}
	
	public void calculateFine(double fine)
	{
		System.out.println("The Car details are: " + car);
		System.out.println("The Total Fine is: " + (25 + (fine * 10)));
		System.out.println("The Policeman incharge is: " + police);
	}
}
