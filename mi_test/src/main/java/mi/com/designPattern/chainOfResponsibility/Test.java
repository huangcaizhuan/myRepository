package mi.com.designPattern.chainOfResponsibility;

public class Test {
	public static void main(String[] args) {
		Leader a = new Director("张三");
		Leader b = new Manager("李四");
		Leader b2 = new GenernalManager2("李小四");
		Leader c = new GenernalManager("王五");
	
	
		a.setNextLeader(b);
		b.setNextLeader(b2);
		b2.setNextLeader(c);
		c.setNextLeader(c);
		
		LeaveRequest r = new LeaveRequest("kity", 1, "go to home");
		a.hadleRequest(r);
	}
}
