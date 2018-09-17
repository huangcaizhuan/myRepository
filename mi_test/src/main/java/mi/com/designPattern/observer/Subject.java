package mi.com.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observser> list = new ArrayList<Observser>();

	public void register(Observser Observser) {
		list.add(Observser);
	}
	public void removeObservser(Observser Observser) {
		list.remove(Observser);
	}

	//通知所有观察者
	public void notifyAllObservsers() {
		for(Observser obs:list) {
			obs.update(this);
		}
	}

}
