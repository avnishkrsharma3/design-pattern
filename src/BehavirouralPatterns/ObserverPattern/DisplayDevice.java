package BehavirouralPatterns.ObserverPattern;

public class DisplayDevice implements observer{
	String name;

	@Override
	public void update(float temp) {
		System.out.println(name + " device temerature is measuring " + temp);
	}
	
	public DisplayDevice() {
		this.name = "Sony LED TV";
	}

}
