package mi.com.designPattern.observer;

public class ObserverA implements Observser{

	private int myState;
	@Override
	public void update(Subject subject) {
		myState = ((ConcreteSubject)subject).getState();
	}
	public int getMyState() {
		return myState;
	}
	public void setMyState(int myState) {
		this.myState = myState;
	}
}
