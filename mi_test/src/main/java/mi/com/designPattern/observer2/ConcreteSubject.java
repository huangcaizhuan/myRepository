package mi.com.designPattern.observer2;

import java.util.Observable;

public class ConcreteSubject extends Observable{

	private int state;
	
	public void set(int s) {
		state = s;
		
		setChanged();//表示目标对象也被修改
		notifyObservers(state);//通知所有观察者
	
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
