package ParkingSimulation;

//The ParkedCar is within the parking time purchased.
public class Test1
{
	private ParkedCar car;
	private ParkingMeter pm;
	private PoliceOfficer police;
	
	public Test1(){
		car = new ParkedCar("BMW", "RAD 345T", "blue", 7);
		pm = new ParkingMeter(10);
		police = new PoliceOfficer("Johnson", "JHPO");
	}
	
	
	public void printTicket()
	{
		police.examineTicket(pm, car);
	}
}
