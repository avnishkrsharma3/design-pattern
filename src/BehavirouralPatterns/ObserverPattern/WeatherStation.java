package BehavirouralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements subject{
	
	private List<observer> observerList;
	
	public WeatherStation() {
		observerList = new ArrayList<>();
	}
	
	@Override
	public void attach(observer observer) {
		observerList.add(observer);
		
	}

	@Override
	public void detach(observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObserver(float temp) {
		/*
		for(int i = 0; i < observerList.size(); i++) {
			observerList.get(i).update(temp);
		}
		*/
		/// weather station is not aware the exact concrete class but still working and immune to change
		// this reverse the code execution
		for(observer observer: observerList) {
			observer.update(temp);  /// this is example of runtime polymorphish
		}
		
	}

}
