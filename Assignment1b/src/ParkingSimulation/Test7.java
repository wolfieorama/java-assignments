package ParkingSimulation;
//The ParkedCar is ticketed for being more than 1 hour over the time purchased.
public class Test7
{
	private ParkedCar car;
	private ParkingMeter pm;
	private PoliceOfficer police;
	
	public Test7(){
		car = new ParkedCar("BMW", "RAD 345T", "blue", 70.5);
		pm = new ParkingMeter(10);
		police = new PoliceOfficer("Johnson", "JHPO");
	}
	
	
	public void printTicket()
	{
		police.examineTicket(pm, car);
	}
}
