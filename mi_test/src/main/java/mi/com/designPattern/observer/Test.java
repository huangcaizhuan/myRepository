package mi.com.designPattern.observer;

public class Test {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		
		//创建多个观察者
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		ObserverA obs4 = new ObserverA();
		
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		System.out.println(obs4.getMyState());
	
		subject.register(obs1);
		subject.register(obs2);
		subject.register(obs3);
		subject.register(obs4);
		
		subject.setState(3000);
		System.out.println(".....set 3000之后......");
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		System.out.println(obs4.getMyState());
		
		
		subject.setState(11111);
		System.out.println(".....set 11111之后......");
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		System.out.println(obs4.getMyState());
	}
}
