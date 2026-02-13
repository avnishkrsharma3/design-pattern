package BehavirouralPatterns.ObserverPattern;

public class ObserverPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subject weatherStation = new WeatherStation();

		// create display device
		observer displayDevice = new DisplayDevice();

		// create Mobile Device
		observer mobileDevice = new MobileDevice();

		// lets attach
		weatherStation.attach(mobileDevice);
		weatherStation.attach(displayDevice);

		// lets notify
		weatherStation.notifyObserver((float) 22.50);
		weatherStation.notifyObserver((float) 23.58);
		
		// lets detach
		weatherStation.detach(mobileDevice);
		
		weatherStation.notifyObserver((float) 37.10);
	}

}
