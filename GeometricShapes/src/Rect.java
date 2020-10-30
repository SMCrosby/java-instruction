
public class Rect implements IPerimeter {

	private Quad quad;
	
	public int getSide1() {
		return quad.getSide1();
	}
	
	public int getSide2() {
		return quad.getSide2();
	}
	
	public void setSide1(int s1) {
		quad.setSide1(s1);
		quad.setSide3(s1);
	}
	
	public void setSide2(int s2) {
		quad.setSide2(s2);
		quad.setSide4(s2);
	}
	
	
	public int area() {
		return (quad.getSide1() * quad.getSide2());
	}
	
	public int perimeter() {
		return quad.perimeter();
	}
	
	public Rect(int s1, int s2) {
		quad = new Quad(s1, s2, s1 ,s2);   //replaces next 4 lines
		//quad.setSide1(s1);
		//quad.setSide2(s2);
		//quad.setSide3(s1);
		//quad.setSide4(s2);
	}
	
	
	public Rect() {
		this(0,0);
		
	}
}
