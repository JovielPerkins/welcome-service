package jm.edu.utech.ap.week5;

public class Driver implements Driveable {
	public void drive(float numberOfMiles) {
		System.out.println(String.format("Andrew has driven"+"%.2f miles",numberOfMiles));
	}
}
