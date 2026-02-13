package BehavirouralPatterns.ObserverPattern;

import BehavirouralPatterns.ObserverPattern.*;

public interface subject {
		public void attach(observer observer);
		public void detach(observer observer);
		public void notifyObserver(float temp);
}
