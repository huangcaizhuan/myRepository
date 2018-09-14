package mi.com.designPattern.memento;

/**
 * 负责管理备忘录对象
 * @author John
 *
 */
public class CareTaker {
	private EmpMemento memento ;

	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}
	
}
