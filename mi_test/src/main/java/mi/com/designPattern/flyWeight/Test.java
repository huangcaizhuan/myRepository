package mi.com.designPattern.flyWeight;

public class Test {
	public static void main(String[] args) {
		ChessFlyWeight chess1 = ChessFlyweightFactory.getChess("黑色");
	
		ChessFlyWeight chess2 = ChessFlyweightFactory.getChess("黑色");
		
		System.out.println(chess1);
		System.out.println(chess1);
		
		chess1.display(new Coordinate(10, 10));
		chess2.display(new Coordinate(20, 20));
	
		ChessFlyWeight chess3 = ChessFlyweightFactory.getChess("红色");
		chess3.display(new Coordinate(20, 20));
	}
}
