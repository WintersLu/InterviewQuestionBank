package Yahoo;

import java.util.ArrayList;
import java.util.List;

public class LightRoom {
	
	public interface Observer{
		public void update(boolean status);
	}
	public interface Subject{
		public void registerObserver(Observer o);
		public void removeObserver(Observer o);
		public void notifyObservers();
	}
	
	
	public class Bubble implements Observer{

		@Override
		public void update(boolean status) {
			// TODO Auto-generated method stub
			
		}
		
	}

	
	public class Switch implements Subject{

		private List<Observer> bubbles;
		private boolean switchStatus;
		
		public Switch(){
			bubbles = new ArrayList<Observer>();
			switchStatus = false;
		}
		
		@Override
		public void registerObserver(Observer o) {
			bubbles.add(o);
		}

		@Override
		public void removeObserver(Observer o) {
			bubbles.remove(o);
		}

		@Override
		public void notifyObservers() {
			for(Observer o: bubbles){
				o.update(switchStatus);
			}
		}
		
	}

}
