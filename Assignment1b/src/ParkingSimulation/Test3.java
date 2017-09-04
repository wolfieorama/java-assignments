package ParkingSimulation;

//The ParkedCar is just barely within the parking time purchased.
public class Test3
{
	private ParkedCar car;
	private ParkingMeter pm;
	private PoliceOfficer police;
	
	public Test3(){
		car = new ParkedCar("BMW", "RAD 345T", "blue", 10.001);
		pm = new ParkingMeter(10);
		police = new PoliceOfficer("Johnson", "JHPO");
	}
	
	
	public void printTicket()
	{
		police.examineTicket(pm, car);
	}
}
