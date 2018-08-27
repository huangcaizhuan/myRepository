package mi.com.designPattern.flyWeight;

/**
 * 享元类
 * @author John
 *
 */
public interface ChessFlyWeight {
	void setColor(String c);
	String getColor();
	void display(Coordinate c);
}
class CoordinateChess implements ChessFlyWeight{
	
	private String color;
	
	public CoordinateChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String c) {
		this.color = c;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("棋子颜色："+color);	
		System.out.println("棋子位置："+c.getX()+"----"+c.getY());
	}
	
}