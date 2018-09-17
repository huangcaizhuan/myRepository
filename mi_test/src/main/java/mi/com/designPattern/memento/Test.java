package mi.com.designPattern.memento;

public class Test {
	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		
		Emp emp = new Emp("kity",19,5000);
		System.out.println("第一次创建对象：："+emp.toString());
	
		//备忘一次
		careTaker.setMemento(emp.empMemento());
	
		emp.setEname("kity2");
		emp.setAge(23);
		emp.setSalary(9000);
		System.out.println("第二次创建对象：："+emp.toString());
	
		//恢复备忘录
		emp.recovery(careTaker.getMemento());
		System.out.println("第三次创建对象：："+emp.toString());
		
	
	}
}
