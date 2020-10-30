
public class Square implements IPerimeter{

	private Rect rect;
	
	public int getSide() {
		return rect.getSide1();
	}
	
	public void setSide(int s) {
		rect.setSide1(s);
		rect.setSide2(s);
	}
	
	public int area() {
		return rect.area();
	}
	
	public int perimeter() {
		return rect.perimeter();
	}
	
	public Square(int s1) {
		rect = new Rect(s1, s1);
	}
	
	
	public Square() {
		this(0);
	}
	
}
