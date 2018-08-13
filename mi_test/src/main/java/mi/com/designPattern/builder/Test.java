package mi.com.designPattern.builder;

import mi.com.designPattern.builder.ComputerBuilder.Computer;

public class Test {
	public void main(String[] args) {
		ComputerBuilder builder = new ComputerBuilder();
		Computer computer = builder.build();
	}
}
