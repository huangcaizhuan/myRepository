package mi.com.designPattern.iterator;

public class Test {
	public static void main(String[] args) {
		ConcreteMyAggregate aggregate = new ConcreteMyAggregate();
		aggregate.addObject("aa");
		aggregate.addObject("bb");
		aggregate.addObject("cc");
		aggregate.addObject("dd");
		
		MyIterator it = aggregate.createIterator();
		while(it.hasNext()) {
			System.out.println(it.getCurrentObj());
			it.next();
		}
	
	
	}
}
