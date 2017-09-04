package ParkingSimulation;

//The ParkedCar is ticketed for being less than 1 hour over the time purchased.
public class Test6
{
	private ParkedCar car;
	private ParkingMeter pm;
	private PoliceOfficer police;
	
	public Test6(){
		car = new ParkedCar("BMW", "RAD 666T", "Yellow", 69);
		pm = new ParkingMeter(10);
		police = new PoliceOfficer("Mike", "J78O");
	}
	
	
	public void printTicket()
	{
		police.examineTicket(pm, car);
	}
}