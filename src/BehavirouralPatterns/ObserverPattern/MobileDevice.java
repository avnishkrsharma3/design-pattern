package BehavirouralPatterns.ObserverPattern;

public class MobileDevice implements observer {
	String name;

	@Override
	public void update(float temp) {
		System.out.println(name + "mobile is measuring temperature " + temp);
	}

	public MobileDevice() {
		this.name = "Google Pixel 6A ";
	}
}
